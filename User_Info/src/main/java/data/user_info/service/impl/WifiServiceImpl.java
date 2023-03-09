package data.user_info.service.impl;

import data.user_info.model.Wifi;
import data.user_info.repository.WifiRepository;
import data.user_info.service.WifiService;

public class WifiServiceImpl implements WifiService {

    private WifiRepository wifiRepository;
    public WifiServiceImpl(WifiRepository wifiRepository){
        this.wifiRepository = wifiRepository;

    }
    @Override
    public Wifi saveWifi(Wifi wifi) {
        return null;
    }
}
