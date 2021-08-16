package controller;

import model.*;
import model.enums.*;
import view.*;


public class Paint {

    private FiguraGeometrica[] vetor;
    private Menus menus;
    private dao.FiguraGeometrica dao;

    public void adicionaNoArray(FiguraGeometrica f){
        boolean adicionado = true;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == null){
                vetor[i] = f;
                adicionado = false;
                break;
            }
        }
        if (adicionado){
            System.out.println("SEM ESPAÇO");
        }
    }

    public Paint() {
        dao = new dao.FiguraGeometrica();
        menus = new Menus();
        vetor = new FiguraGeometrica[10];
    }

    public void inicio() {
        MENUPRINCIPAL opcao;
        do {
            opcao = menus.MenuPrincipal();
            switch (opcao){
                case PONTO -> {
                    SUBMENUS opFig = menus.MenuDaFiguraGeometrica(new Ponto());

                }
                case RETA -> {
                    Reta generic = new Reta(0);
                    SUBMENUS opFig = menus.MenuDaFiguraGeometrica(generic);
                    RetaMenu rm = new RetaMenu();
                    switch (opFig){
                        case NOVO -> {
                            adicionaNoArray(rm.criarFigura());
                        }
                        case LISTAR -> {
                            rm.listarFigura(generic, vetor);
                        }
                        case EDITAR -> {
                            rm.atualizarFigura(vetor, SUBMENUS.EDITAR);
                        }
                        case MOSTRAR -> {
                            rm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.MOSTRAR);
                        }
                        case EXCLUIR -> {
                            rm.apagarFigura(generic.getTipo(),vetor, SUBMENUS.EXCLUIR);
                        }
                    }
                }
                case CIRCULO -> {
                    Circulo generic = new Circulo(0);
                    SUBMENUS opFig = menus.MenuDaFiguraGeometrica(generic);
                    CirculoMenu cm = new CirculoMenu();
                    switch (opFig) {
                        case NOVO -> {
                            adicionaNoArray(cm.criarFigura());
                        }
                        case LISTAR -> {
                            cm.listarFigura(generic, vetor);
                        }
                        case EDITAR -> {
                            cm.atualizarFigura(vetor, SUBMENUS.EDITAR);
                        }
                        case MOSTRAR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.MOSTRAR);
                        }
                        case EXCLUIR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.EXCLUIR);
                        }
                    }
                }
                case QUADRADO -> {
                    Quadrado generic = new Quadrado(0);
                    SUBMENUS opFig = menus.MenuDaFiguraGeometrica(generic);
                    QuadradoMenu cm = new QuadradoMenu();
                    switch (opFig) {
                        case NOVO -> {
                            adicionaNoArray(cm.criarFigura());
                        }
                        case LISTAR -> {
                            cm.listarFigura(generic, vetor);
                        }
                        case EDITAR -> {
                            cm.atualizarFigura(vetor, SUBMENUS.EDITAR);
                        }
                        case MOSTRAR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.MOSTRAR);
                        }
                        case EXCLUIR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.EXCLUIR);
                        }
                    }
                }
                case RETANGULO -> {
                    Quadrilatero generic = new Quadrilatero(0,0);
                    SUBMENUS opFig = menus.MenuDaFiguraGeometrica(generic);
                    QuadrilateroMenu cm = new QuadrilateroMenu();
                    switch (opFig) {
                        case NOVO -> {
                            adicionaNoArray(cm.criarFigura());
                        }
                        case LISTAR -> {
                            cm.listarFigura(generic, vetor);
                        }
                        case EDITAR -> {
                            cm.atualizarFigura(vetor, SUBMENUS.EDITAR);
                        }
                        case MOSTRAR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.MOSTRAR);
                        }
                        case EXCLUIR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.EXCLUIR);
                        }
                    }
                }
                case PENTAGONO -> {
                    Pentagono generic = new Pentagono(0);
                    SUBMENUS opFig = menus.MenuDaFiguraGeometrica(generic);
                    PentagonoMenu cm = new PentagonoMenu();
                    switch (opFig) {
                        case NOVO -> {
                            adicionaNoArray(cm.criarFigura());
                        }
                        case LISTAR -> {
                            cm.listarFigura(generic, vetor);
                        }
                        case EDITAR -> {
                            cm.atualizarFigura(vetor, SUBMENUS.EDITAR);
                        }
                        case MOSTRAR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.MOSTRAR);
                        }
                        case EXCLUIR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.EXCLUIR);
                        }
                    }
                }
                case HEXAGONO -> {
                    Hexagono generic = new Hexagono(0);
                    SUBMENUS opFig = menus.MenuDaFiguraGeometrica(generic);
                    HexagonoMenu cm = new HexagonoMenu();
                    switch (opFig) {
                        case NOVO -> {
                            adicionaNoArray(cm.criarFigura());
                        }
                        case LISTAR -> {
                            cm.listarFigura(generic, vetor);
                        }
                        case EDITAR -> {
                            cm.atualizarFigura(vetor, SUBMENUS.EDITAR);
                        }
                        case MOSTRAR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.MOSTRAR);
                        }
                        case EXCLUIR -> {
                            cm.mostrarFigura(generic.getTipo(),vetor, SUBMENUS.EXCLUIR);
                        }
                    }
                }
                case RECARREGAR -> {
                    vetor = dao.carregarArquivo();
                }
                case LISTAR -> {
                    menus.listar(vetor);
                }
                case SALVAR -> {
                    dao.salvarArquivo(vetor);
                }
                case DESENHAR -> {
                    menus.desenhar();
                }
                default -> {
                    opcao = MENUPRINCIPAL.SAIR;
                }
            }
        } while (opcao != MENUPRINCIPAL.SAIR);
    }
}
