/*
 *  Copyright (c) 2017 . Tencent 蓝鲸智云(BlueKing)
 */

package com.tencent.bk.core.sdk.cmdb.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tencent.bk.core.sdk.protocol.ESBReq;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddPlatIdReq extends ESBReq {

    @JsonProperty("plat_name")
    private String platName;
}
