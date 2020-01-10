package com.qy.emt.model;

import com.qy.emt.config.EthConfig;
import com.qy.emt.utils.blockchain.eth.CCMUtils;
import com.qy.emt.utils.blockchain.eth.ETHUtils;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

/**
 * Description:
 * Data：2018/12/16-6:47 PM
 */
public class TransferModel {

    public TransferModel() {

    }

    /**
     * 本地转账
     */
    public String localTransafer(String tokenName, String privateKey, String toAddress, String amount, BigInteger GasPrice) throws ExecutionException, InterruptedException {
        CCMUtils CCMUtils = new CCMUtils();
        ETHUtils eTHUtils = new ETHUtils();
        String msg = null;
        switch (tokenName) {

            case "ETH":
                msg = eTHUtils.transfer(privateKey, toAddress, amount, GasPrice);
                break;
            case "EMTC":
                msg = CCMUtils.transfer(privateKey, toAddress, amount, GasPrice);
                break;
            case "SAR":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAR_CONTRACT);
                break;
            case "SAR-ASI":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAR_ASI_CONTRACT);
                break;
            case "CCM-ISR":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.CCM_ISR_CONTRACT);
                break;
            case "SAR-SAN":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAR_SAN_CONTRACT);
                break;
            case "HKDD":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.HKDD_CONTRACT);
                break;
            case "SAR-S":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAR_S_CONTRACT);
                break;
            case "ISR-S":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.ISR_S_CONTRACT);
                break;
            case "CCM-S":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.CCM_S_CONTRACT);
                break;
            case "SAR-ES":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAR_ES_CONTRACT);
                break;
            case "HKDD-S":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.HKDD_S_CONTRACT);
                break;

//                新增
            case "SAN-0301":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_0301_CONTRACT);
                break;
            case "SAN-0306":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_0306_CONTRACT);
                break;
            case "SAN-0502":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_0502_CONTRACT);
                break;
            case "SAN-3105":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_3105_CONTRACT);
                break;
            case "SAN-3301":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_3301_CONTRACT);
                break;
            case "SAN-2101":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_2101_CONTRACT);
                break;
            case "SAN-2105":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_2105_CONTRACT);
                break;
            case "SAN-2406":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_2406_CONTRACT);
                break;
            case "SAN-410101":
                msg = CCMUtils.tokenTransfer(privateKey, toAddress, amount, EthConfig.SAN_410101_CONTRACT);
                break;

            default:
                break;
        }
        return msg;
    }

}
