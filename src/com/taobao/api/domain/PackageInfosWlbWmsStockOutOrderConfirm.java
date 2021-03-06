package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 包裹信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PackageInfosWlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 4171999255743911394L;

	/**
	 * 包裹编号
	 */
	@ApiField("package_code")
	private String packageCode;

	/**
	 * 包裹高度，单位：毫米
	 */
	@ApiField("package_height")
	private Long packageHeight;

	/**
	 * 包裹里面的商品信息
	 */
	@ApiField("package_item_items")
	private PackageItemItemsWlbWmsStockOutOrderConfirm packageItemItems;

	/**
	 * 包裹长度，单位：毫米
	 */
	@ApiField("package_length")
	private Long packageLength;

	/**
	 * 包裹重量，单位：克
	 */
	@ApiField("package_weight")
	private Long packageWeight;

	/**
	 * 包裹宽度，单位：毫米
	 */
	@ApiField("package_width")
	private Long packageWidth;

	/**
	 * 快递公司编码
	 */
	@ApiField("tms_code")
	private String tmsCode;

	/**
	 * 运单号
	 */
	@ApiField("tms_order_code")
	private String tmsOrderCode;


	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public Long getPackageHeight() {
		return this.packageHeight;
	}
	public void setPackageHeight(Long packageHeight) {
		this.packageHeight = packageHeight;
	}

	public PackageItemItemsWlbWmsStockOutOrderConfirm getPackageItemItems() {
		return this.packageItemItems;
	}
	public void setPackageItemItems(PackageItemItemsWlbWmsStockOutOrderConfirm packageItemItems) {
		this.packageItemItems = packageItemItems;
	}

	public Long getPackageLength() {
		return this.packageLength;
	}
	public void setPackageLength(Long packageLength) {
		this.packageLength = packageLength;
	}

	public Long getPackageWeight() {
		return this.packageWeight;
	}
	public void setPackageWeight(Long packageWeight) {
		this.packageWeight = packageWeight;
	}

	public Long getPackageWidth() {
		return this.packageWidth;
	}
	public void setPackageWidth(Long packageWidth) {
		this.packageWidth = packageWidth;
	}

	public String getTmsCode() {
		return this.tmsCode;
	}
	public void setTmsCode(String tmsCode) {
		this.tmsCode = tmsCode;
	}

	public String getTmsOrderCode() {
		return this.tmsOrderCode;
	}
	public void setTmsOrderCode(String tmsOrderCode) {
		this.tmsOrderCode = tmsOrderCode;
	}

}
