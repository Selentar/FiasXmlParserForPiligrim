package ru.selentar.parser.model;

import javax.persistence.*;

/**
 * Таблица, хранящая географические названия регионов, районов, городов, улиц.
 * Документация <a href="http://fias.nalog.ru/Updates.aspx">http://fias.nalog.ru/Updates.aspx</a>
 */
@Entity
@Table(name="ADDROBJ")
public class Addrobj {
/**
 * Поля таблицы согласно документации
 *
 * Aoguid;
 * Formalname;
 * Regioncode;
 * Autocode;
 * Areacode;
 * Citycode;
 * Ctarcode;
 * Placecode;
 * Plancode;
 * Streetcode;
 * Extrcode;
 * Sextcode;
 * Offname;
 * Postalcode;
 * Ifnsfl;
 * Terrifnsfl;
 * Ifnsul;
 * Terrifnsul;
 * Okato;
 * Oktmo;
 * Updatedate;
 * Shortname;
 * Aolevel ;
 * Parentguid;
 * Aoid;
 * Previd;
 * Nextid;
 * Code;
 * Plaincode;
 * Actstatus;
 * Livestatus;
 * Centstatus;
 * Operstatus;
 * Currstatus;
 * Startdate;
 * Enddate;
 * Normdoc;
 * Cadnum;
 * Divtype;
 */

    @Column(name="AOGUID", length = 36)
    private String aoguid; //Глобальный уникальный идентификатор адресного объекта

    @Column(name="FORMALNAME", length = 120)
    private String formalname; //Формализованное наименование

    @Column(name="REGIONCODE", length = 2)
    private String regioncode; //Код региона

    @Column(name="AUTOCODE", length = 1)
    private String autocode; //Код автономии

    @Column(name="AREACODE", length = 3)
    private String areacode; //Код района

    @Column(name="CITYCODE", length = 3)
    private String citycode; //Код города

    @Column(name="CTARCODE", length = 3)
    private String ctarcode; //Код внутригородского района

    @Column(name="PLACECODE", length = 3)
    private String placecode; //Код населенного пункта

    @Column(name="PLANCODE", length = 4)
    private String plancode; //Код элемента планировочной структуры

    @Column(name="STREETCODE", length = 4)
    private String streetcode; //Код улицы

    @Column(name="EXTRCODE", length = 4)
    private String extrcode; //Код дополнительного адресообразующего элемента

    @Column(name="SEXTCODE", length = 3)
    private String sextcode; //Код подчиненного дополнительного адресообразующего элемента

//    @Column(name="OFFNAME", length = 120)
//    private String offname; //Официальное наименование
//
//    @Column(name="POSTALCODE", length = 6)
//    private String postalcode; //Почтовый индекс
//
//    @Column(name="IFNSFL", length = 4)
//    private String ifnsfl; //Код ИФНС ФЛ
//
//    @Column(name="TERRIFNSFL", length = 4)
//    private String terrifnsfl; //Код территориального участка ИФНС ФЛ
//
//    @Column(name="IFNSUL", length = 4)
//    private String ifnsul; //Код ИФНС ЮЛ
//
//    @Column(name="TERRIFNSUL", length = 4)
//    private String terrifnsul; //Код территориального участка ИФНС ЮЛ
//
//    @Column(name="OKATO", length = 11)
//    private String okato; //ОКАТО
//
//    @Column(name="OKTMO", length = 11)
//    private String oktmo; //ОКТМО
//
//    @Column(name="UPDATEDATE")
//    @Temporal(TemporalType.DATE)
//    private Calendar updatedate; //Дата  внесения (обновления) записи

    @Column(name="SHORTNAME", length = 10)
    private String shortname; //Краткое наименование типа объекта

    /**
    1 - регион
    2 - зарезервирован
    3 - район
    4 - город
    5 - внутригородская территория
    6 - населенный пункт
    7 - улицы
    8 - зарезервирован
    90 - дополнительная территория (ГСК, СНТ, лагери отдыха и т.п.)
    91 - улицы на дополнительной территории (улицы, линии, проезды)
     */
    @Column(name="AOLEVEL")
    private Integer aolevel; //Уровень адресного объекта

    @Column(name="PARENTGUID", length = 36)
    private String parentguid; //Идентификатор объекта родительского объекта

    @Id
    @Column(name="AOID", length = 36)
    private String aoid; //Уникальный идентификатор записи. Ключевое поле.

//    @Column(name="PREVID", length = 36)
//    private String previd; //Идентификатор записи связывания с предыдушей исторической записью
//
//    @Column(name="NEXTID", length = 36)
//    private String nextid; //Идентификатор записи  связывания с последующей исторической записью
//
//    @Column(name="CODE", length = 17)
//    private String code; //Код адресного элемента одной строкой с признаком актуальности из классификационного кода
//
//    @Column(name="PLAINCODE", length = 15)
//    private String plaincode; //Код адресного элемента одной строкой без признака актуальности (последних двух цифр)
//
//    /*Статус последней исторической записи в жизненном цикле адресного объекта:
//    0 – Не последняя
//    1 - Последняя*/
//    @Column(name="ACTSTATUS")
//    private Integer actstatus;
//
//    /*Статус актуальности адресного объекта ФИАС на текущую дату:
//    0 – Не актуальный
//    1 - Актуальный*/
//    @Column(name="LIVESTATUS")
//    private Integer livestatus;
//
//    @Column(name="CENTSTATUS")
//    private Integer centstatus; //Статус центра
//
//    @Column(name="OPERSTATUS")
//    private Integer operstatus; //Статус действия над записью – причина появления записи (см. OperationStatuses )
//
//    @Column(name="CURRSTATUS")
//    private Integer currstatus; //Статус актуальности КЛАДР 4 (последние две цифры в коде)
//
//    @Column(name="STARTDATE")
//    @Temporal(TemporalType.DATE)
//    private Calendar startdate; //Начало действия записи
//
//    @Column(name="ENDDATE")
//    @Temporal(TemporalType.DATE)
//    private Calendar enddate; //Окончание действия записи
//
//    @Column(name="NORMDOC", length = 36)
//    private String normdoc; //Внешний ключ на нормативный документ
//
//    @Column(name="CADNUM", length = 100)
//    private String cadnum; //Кадастровый номер
//
//    /*Тип деления:
//    0 – не определено
//    1 – муниципальное
//    2 – административное*/
//    @Column(name="DIVTYPE")
//    private Integer divtype;

    /******************************************************
     * Ниже только автоматически генерируемый код
     *****************************************************/

    public String getAoguid() {
        return aoguid;
    }

    public void setAoguid(String aoguid) {
        this.aoguid = aoguid;
    }

    public String getFormalname() {
        return formalname;
    }

    public void setFormalname(String formalname) {
        this.formalname = formalname;
    }

    public String getRegioncode() {
        return regioncode;
    }

    public void setRegioncode(String regioncode) {
        this.regioncode = regioncode;
    }

    public String getAutocode() {
        return autocode;
    }

    public void setAutocode(String autocode) {
        this.autocode = autocode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCtarcode() {
        return ctarcode;
    }

    public void setCtarcode(String ctarcode) {
        this.ctarcode = ctarcode;
    }

    public String getPlacecode() {
        return placecode;
    }

    public void setPlacecode(String placecode) {
        this.placecode = placecode;
    }

    public String getPlancode() {
        return plancode;
    }

    public void setPlancode(String plancode) {
        this.plancode = plancode;
    }

    public String getStreetcode() {
        return streetcode;
    }

    public void setStreetcode(String streetcode) {
        this.streetcode = streetcode;
    }

    public String getExtrcode() {
        return extrcode;
    }

    public void setExtrcode(String extrcode) {
        this.extrcode = extrcode;
    }

    public String getSextcode() {
        return sextcode;
    }

    public void setSextcode(String sextcode) {
        this.sextcode = sextcode;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Integer getAolevel() {
        return aolevel;
    }

    public void setAolevel(Integer aolevel) {
        this.aolevel = aolevel;
    }

    public String getParentguid() {
        return parentguid;
    }

    public void setParentguid(String parentguid) {
        this.parentguid = parentguid;
    }

    public String getAoid() {
        return aoid;
    }

    public void setAoid(String aoid) {
        this.aoid = aoid;
    }
}
