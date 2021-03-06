package io.github.rbxapi.Javablox.api.billing.xsollapayments;

/**
 * https://billing.roblox.com/docs#/XsollaPayments
 */
public interface IXsollaPayments {

    /**
     * Get the Xsolla iframe token
     * https://billing.roblox.com/docs#!/XsollaPayments/post_v1_payments_xsolla_iframe_token
     * @param xsollaIframeRequest {
     *   "mainProductId": 0,
     *   "upsellProductId": 0,
     *   "paymentProviderType": "string",
     *   "verifiedEmailOrPhone": true
     * }
     * @return {
     *   "token": "string",
     *   "success": true,
     *   "message": "string"
     * }
     */
    String getIframeToken(String xsollaIframeRequest);
}
