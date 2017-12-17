
package introsde.soap.eactivity.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="activityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPORT"/>
 *     &lt;enumeration value="SOCIAL"/>
 *     &lt;enumeration value="WORK"/>
 *     &lt;enumeration value="TRAVEL"/>
 *     &lt;enumeration value="CULTURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "activityType")
@XmlEnum
public enum ActivityType {

    SPORT,
    SOCIAL,
    WORK,
    TRAVEL,
    CULTURE;

    public String value() {
        return name();
    }

    public static ActivityType fromValue(String v) {
        return valueOf(v);
    }

}
