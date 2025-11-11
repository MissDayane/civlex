//package com.civlex.civlex.validators;
//
//
//public class CpfValidator {
//
//    public static boolean validarCpf(String cpf){
//
//        // Remove quaisquer caracteres não numéricos, se quiser permitir máscara
//        cpf = cpf.replaceAll("\\D", "");
//
//        if (cpf == null || !cpf.matches("\\d{11}")) return false; //deve conte 11 digitos e não pode estar vazio
//
//        if (cpf.chars().distinct().count() == 1) return false; //não pode ser numeros repetidos
//
//
//}
