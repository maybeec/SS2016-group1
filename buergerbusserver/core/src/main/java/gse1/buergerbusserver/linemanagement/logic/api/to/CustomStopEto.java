package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

import org.geojson.Point;

import gse1.buergerbusserver.general.common.api.datatype.InfoObject;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author ricarda
 *
 *         edited JAYU
 */
public class CustomStopEto extends AbstractEto {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long lineId;

  // private Long id;

  private Date pickUpTime;

  private Point stopLocation;

  private int numberOfPersons;

  private String deviceId;

  private String userInfo;

  private int status;

  private Long acceptingBus;

  private Date timeStamp;

  /**
   * The constructor.
   */
  public CustomStopEto() {

    super();
  }

  public Long getAcceptingBus() {

    return this.acceptingBus;
  }

  public void setAcceptingBus(Long acceptingBus) {

    this.acceptingBus = acceptingBus;
  }

  public String getRejectingBus() {

    return this.rejectingBus;
  }

  public void setRejectingBus(String rejectingBus) {

    this.rejectingBus = rejectingBus;
  }

  private String rejectingBus;

  // public Long getId() {
  //
  // return this.id;
  // }
  //
  // public void setId(Long id) {
  //
  // this.id = id;
  // }

  /**
   *
   * @param lineId new value of {@link #getLineId}.
   */

  public void setLineId(Long lineId) {

    this.lineId = lineId;

  }

  /**
   * @return lineId
   */

  public Long getLineId() {

    return this.lineId;
  }

  /**
   * @param pickUpTime pickUpTime new value of {@link #getPickUpTime}
   */

  public void setPickUpTime(Date pickUpTime) {

    this.pickUpTime = pickUpTime;

  }

  /**
   * @return pickUpTime
   */

  public Date getPickUpTime() {

    return this.pickUpTime;
  }

  /**
   *
   * @param stopLocation set the GPS coordinates
   */

  // @Convert(converter = LineStringConverter.class)
  public void setStopLocation(Point stopLocation) {

    this.stopLocation = stopLocation;
  }

  // @Convert(converter = LineStringConverter.class)
  /**
   * @return points
   */
  public Point getStopLocation() {

    return this.stopLocation;
  }

  /**
   * @param numberOfPersons Sets No.of persons who requested the customer Stop
   *
   */

  public void setNumberOfPersons(int numberOfPersons) {

    this.numberOfPersons = numberOfPersons;

  }

  /**
   * @return NumberOfPersons who requested the Custom Stop
   */

  public int getNumberOfPersons() {

    return this.numberOfPersons;
  }

  /**
   * @param deviceId new value of device id.
   */

  public void setDeviceId(String deviceId) {

    this.deviceId = deviceId;

  }

  /**
   * @return deviceId
   */

  public String getDeviceId() {

    return this.deviceId;
  }

  /**
   * @param userInfo new value of user info
   */

  // @Convert(converter = StringListConverter.class)
  public void setUserInfo(String userInfo) {

    this.userInfo = userInfo;

  }

  // @Convert(converter = StringListConverter.class)
  public String getUserInfo() {

    return this.userInfo;
  }

  /**
   * @param status Set the Status of the Bus
   */

  public void setStatus(int status) {

    this.status = status;

  }

  public int getStatus() {

    return this.status;
  }

  /**
   * @param timeStamp Sets date time on create/update
   *
   */

  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  /**
   * @return timeStamp for the line when it last updated
   */

  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @return user information
   */
  public InfoObject getInfo() {

    return new InfoObject(this.userInfo);

  }

  // /**
  // * @return location
  // */
  //
  // public GeoJsonPoint getLocation() {
  //
  // List<String> stringList = Arrays.asList(this.stopLocation.split(","));
  //
  // double lon;
  // double lat;
  //
  // lon = Double.parseDouble(stringList.get(0));
  // lat = Double.parseDouble(stringList.get(1));
  //
  // return new GeoJsonPoint(lon, lat);
  // }

}