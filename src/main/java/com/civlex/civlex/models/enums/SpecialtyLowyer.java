package com.civlex.civlex.models.enums;

public enum SpecialtyLowyer {

    // Áreas de Direito Privado e Empresarial
    CIVIL_LAW              ("Obrigações, Contratos, Responsabilidade Civil, etc.)"),
    FAMILY_AND_SUCCESSION   ("Divórcio, Inventário, Guarda, Pensão"),
    CONSUMER_LAW            ("Relações de consumo, defesa do consumidor"),
    REAL_ESTATE_LAW         ("Contratos imobiliários, locação, condomínios"),
    BUSINESS_LAW            ("Empresas, sociedades, falência, títulos de crédito"),
    LABOR_LAW               ("Reclamações trabalhistas, relações empregado-empregador"),
    TAX_LAW                 ("Impostos, taxas, contribuições, planejamento fiscal"),
    DIGITAL_LAW             ("LGPD, crimes cibernéticos, e-commerce,Direito Digital"),

    // Áreas de Direito Público e Criminal
    CRIMINAL_LAW            ("Defesa ou acusação em crimes"),
    ADMINISTRATIVE_LAW      ("Licitações, concursos públicos, servidores, órgãos públicos"),
    ENVIRONMENTAL_LAW       ("Legislação ambiental, licenças, infrações"),
    CONSTITUTIONAL_LAW      ("Direitos e garantias fundamentais, controle de constitucionalidade"),
    SOCIAL_SECURITY_LAW     ("Aposentadoria, pensões, benefícios do INSS"),
    INTERNATIONAL_LAW       ("Relações entre países, comércio exterior, tratados"),

    // Áreas específicas/em ascensão
    SPORTS_LAW              ("Regulamentação de esportes, contratos de atletas"),
    HEALTH_LAW              ("Planos de saúde, SUS, erro médico"),
    FASHION_LAW             ("Propriedade intelectual, contratos da indústria da moda"),
    AGRARIAN_LAW            ("Questões rurais, terra, agronegócio"),
    INTELLECTUAL_PROPERTY   ("Marcas, patentes, direitos autorais");

    private final String description;
    SpecialtyLowyer(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.description;
    }



}
