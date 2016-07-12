package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoWaybillIiGetResponse;

/**
 * TOP API: cainiao.waybill.ii.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.07
 */
public class CainiaoWaybillIiGetRequest extends BaseTaobaoRequest<CainiaoWaybillIiGetResponse> {
	
	

	/** 
	* 入参信息
	 */
	private String paramWaybillCloudPrintApplyNewRequest;

	public void setParamWaybillCloudPrintApplyNewRequest(String paramWaybillCloudPrintApplyNewRequest) {
		this.paramWaybillCloudPrintApplyNewRequest = paramWaybillCloudPrintApplyNewRequest;
	}

	public void setParamWaybillCloudPrintApplyNewRequest(WaybillCloudPrintApplyNewRequest paramWaybillCloudPrintApplyNewRequest) {
		this.paramWaybillCloudPrintApplyNewRequest = new JSONWriter(false,true).write(paramWaybillCloudPrintApplyNewRequest);
	}

	public String getParamWaybillCloudPrintApplyNewRequest() {
		return this.paramWaybillCloudPrintApplyNewRequest;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_waybill_cloud_print_apply_new_request", this.paramWaybillCloudPrintApplyNewRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiGetResponse> getResponseClass() {
		return CainiaoWaybillIiGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 地址
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddressDto extends TaobaoObject {
		private static final long serialVersionUID = 6757787892916267579L;
		/**
		 * 城市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 详细地址
		 */
		@ApiField("detail")
		private String detail;
		/**
		 * 区
		 */
		@ApiField("district")
		private String district;
		/**
		 * 省
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道
		 */
		@ApiField("town")
		private String town;
	
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDetail() {
			return this.detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getDistrict() {
			return this.district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getTown() {
			return this.town;
		}
		public void setTown(String town) {
			this.town = town;
		}
	}
	
	/**
	 * 发货人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 2141146581879994849L;
		/**
		 * 地址
		 */
		@ApiField("address")
		private AddressDto address;
		/**
		 * 手机号码
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 固定电话
		 */
		@ApiField("phone")
		private String phone;
	
		public AddressDto getAddress() {
			return this.address;
		}
		public void setAddress(AddressDto address) {
			this.address = address;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
	}
	
	/**
	 * 订单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 5694573998459737739L;
		/**
		 * 订单平台
		 */
		@ApiField("order_channels_type")
		private String orderChannelsType;
		/**
		 * 订单号
		 */
		@ApiListField("trade_order_list")
		@ApiField("string")
		private List<String> tradeOrderList;
	
		public String getOrderChannelsType() {
			return this.orderChannelsType;
		}
		public void setOrderChannelsType(String orderChannelsType) {
			this.orderChannelsType = orderChannelsType;
		}
		public List<String> getTradeOrderList() {
			return this.tradeOrderList;
		}
		public void setTradeOrderList(List<String> tradeOrderList) {
			this.tradeOrderList = tradeOrderList;
		}
	}
	
	/**
	 * 商品信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Item extends TaobaoObject {
		private static final long serialVersionUID = 3815641731894649816L;
		/**
		 * 数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 包裹信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PackageInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 2372798748951281817L;
		/**
		 * 包裹id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 商品信息
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * 体积
		 */
		@ApiField("volume")
		private Long volume;
		/**
		 * 重量
		 */
		@ApiField("weight")
		private Long weight;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public List<Item> getItems() {
			return this.items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		public Long getVolume() {
			return this.volume;
		}
		public void setVolume(Long volume) {
			this.volume = volume;
		}
		public Long getWeight() {
			return this.weight;
		}
		public void setWeight(Long weight) {
			this.weight = weight;
		}
	}
	
	/**
	 * 请求面单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TradeOrderInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 6697649681844168163L;
		/**
		 * 服务值
		 */
		@ApiField("logistics_services")
		private String logisticsServices;
		/**
		 * 请求ID
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 订单信息
		 */
		@ApiField("order_info")
		private OrderInfoDto orderInfo;
		/**
		 * 包裹信息
		 */
		@ApiField("package_info")
		private PackageInfoDto packageInfo;
		/**
		 * 收件人信息
		 */
		@ApiField("recipient")
		private UserInfoDto recipient;
		/**
		 * 模板URL
		 */
		@ApiField("template_url")
		private String templateUrl;
		/**
		 * 使用者ID
		 */
		@ApiField("user_id")
		private Long userId;
	
		public String getLogisticsServices() {
			return this.logisticsServices;
		}
		public void setLogisticsServices(String logisticsServices) {
			this.logisticsServices = logisticsServices;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public OrderInfoDto getOrderInfo() {
			return this.orderInfo;
		}
		public void setOrderInfo(OrderInfoDto orderInfo) {
			this.orderInfo = orderInfo;
		}
		public PackageInfoDto getPackageInfo() {
			return this.packageInfo;
		}
		public void setPackageInfo(PackageInfoDto packageInfo) {
			this.packageInfo = packageInfo;
		}
		public UserInfoDto getRecipient() {
			return this.recipient;
		}
		public void setRecipient(UserInfoDto recipient) {
			this.recipient = recipient;
		}
		public String getTemplateUrl() {
			return this.templateUrl;
		}
		public void setTemplateUrl(String templateUrl) {
			this.templateUrl = templateUrl;
		}
		public Long getUserId() {
			return this.userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
	}
	
	/**
	 * 入参信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WaybillCloudPrintApplyNewRequest extends TaobaoObject {
		private static final long serialVersionUID = 6118582497271273148L;
		/**
		 * 物流公司Code
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 产品类型编码
		 */
		@ApiField("product_code")
		private String productCode;
		/**
		 * 发货人信息
		 */
		@ApiField("sender")
		private UserInfoDto sender;
		/**
		 * 请求面单信息
		 */
		@ApiListField("trade_order_info_dtos")
		@ApiField("trade_order_info_dto")
		private List<TradeOrderInfoDto> tradeOrderInfoDtos;
	
		public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public String getProductCode() {
			return this.productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public UserInfoDto getSender() {
			return this.sender;
		}
		public void setSender(UserInfoDto sender) {
			this.sender = sender;
		}
		public List<TradeOrderInfoDto> getTradeOrderInfoDtos() {
			return this.tradeOrderInfoDtos;
		}
		public void setTradeOrderInfoDtos(List<TradeOrderInfoDto> tradeOrderInfoDtos) {
			this.tradeOrderInfoDtos = tradeOrderInfoDtos;
		}
	}
	

}