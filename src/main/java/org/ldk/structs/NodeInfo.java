package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class NodeInfo extends CommonBase {
	NodeInfo(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.NodeInfo_free(ptr); }
	}

	public NodeInfo clone() {
		long ret = bindings.NodeInfo_clone(this.ptr);
		NodeInfo ret_hu_conv = new NodeInfo(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public void set_channels(long[] val) {
		bindings.NodeInfo_set_channels(this.ptr, val);
	}

	public RoutingFees get_lowest_inbound_channel_fees() {
		long ret = bindings.NodeInfo_get_lowest_inbound_channel_fees(this.ptr);
		RoutingFees ret_hu_conv = new RoutingFees(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public void set_lowest_inbound_channel_fees(RoutingFees val) {
		bindings.NodeInfo_set_lowest_inbound_channel_fees(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public NodeAnnouncementInfo get_announcement_info() {
		long ret = bindings.NodeInfo_get_announcement_info(this.ptr);
		NodeAnnouncementInfo ret_hu_conv = new NodeAnnouncementInfo(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public void set_announcement_info(NodeAnnouncementInfo val) {
		bindings.NodeInfo_set_announcement_info(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public static NodeInfo constructor_new(long[] channels_arg, RoutingFees lowest_inbound_channel_fees_arg, NodeAnnouncementInfo announcement_info_arg) {
		long ret = bindings.NodeInfo_new(channels_arg, lowest_inbound_channel_fees_arg == null ? 0 : lowest_inbound_channel_fees_arg.ptr & ~1, announcement_info_arg == null ? 0 : announcement_info_arg.ptr & ~1);
		NodeInfo ret_hu_conv = new NodeInfo(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		ret_hu_conv.ptrs_to.add(lowest_inbound_channel_fees_arg);
		ret_hu_conv.ptrs_to.add(announcement_info_arg);
		return ret_hu_conv;
	}

	public byte[] write() {
		byte[] ret = bindings.NodeInfo_write(this.ptr);
		return ret;
	}

	public static Result_NodeInfoDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.NodeInfo_read(ser);
		Result_NodeInfoDecodeErrorZ ret_hu_conv = Result_NodeInfoDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
