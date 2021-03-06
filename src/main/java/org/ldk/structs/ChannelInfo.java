package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class ChannelInfo extends CommonBase {
	ChannelInfo(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.ChannelInfo_free(ptr); }
	}

	public ChannelFeatures get_features() {
		long ret = bindings.ChannelInfo_get_features(this.ptr);
		ChannelFeatures ret_hu_conv = new ChannelFeatures(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public void set_features(ChannelFeatures val) {
		bindings.ChannelInfo_set_features(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
		// Due to rust's strict-ownership memory model, in some cases we need to "move"
		// an object to pass exclusive ownership to the function being called.
		// In most cases, we avoid this being visible in GC'd languages by cloning the object
		// at the FFI layer, creating a new object which Rust can claim ownership of
		// However, in some cases (eg here), there is no way to clone an object, and thus
		// we actually have to pass full ownership to Rust.
		// Thus, after this call, val is reset to null and is now a dummy object.
		val.ptr = 0;
	}

	public byte[] get_node_one() {
		byte[] ret = bindings.ChannelInfo_get_node_one(this.ptr);
		return ret;
	}

	public void set_node_one(byte[] val) {
		bindings.ChannelInfo_set_node_one(this.ptr, val);
	}

	public DirectionalChannelInfo get_one_to_two() {
		long ret = bindings.ChannelInfo_get_one_to_two(this.ptr);
		DirectionalChannelInfo ret_hu_conv = new DirectionalChannelInfo(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public void set_one_to_two(DirectionalChannelInfo val) {
		bindings.ChannelInfo_set_one_to_two(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public byte[] get_node_two() {
		byte[] ret = bindings.ChannelInfo_get_node_two(this.ptr);
		return ret;
	}

	public void set_node_two(byte[] val) {
		bindings.ChannelInfo_set_node_two(this.ptr, val);
	}

	public DirectionalChannelInfo get_two_to_one() {
		long ret = bindings.ChannelInfo_get_two_to_one(this.ptr);
		DirectionalChannelInfo ret_hu_conv = new DirectionalChannelInfo(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public void set_two_to_one(DirectionalChannelInfo val) {
		bindings.ChannelInfo_set_two_to_one(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public ChannelAnnouncement get_announcement_message() {
		long ret = bindings.ChannelInfo_get_announcement_message(this.ptr);
		ChannelAnnouncement ret_hu_conv = new ChannelAnnouncement(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public void set_announcement_message(ChannelAnnouncement val) {
		bindings.ChannelInfo_set_announcement_message(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public byte[] write() {
		byte[] ret = bindings.ChannelInfo_write(this.ptr);
		return ret;
	}

	public static ChannelInfo constructor_read(byte[] ser) {
		long ret = bindings.ChannelInfo_read(ser);
		ChannelInfo ret_hu_conv = new ChannelInfo(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

}
