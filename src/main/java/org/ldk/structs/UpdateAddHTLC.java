package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class UpdateAddHTLC extends CommonBase {
	UpdateAddHTLC(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.UpdateAddHTLC_free(ptr); }
	}

	public UpdateAddHTLC clone() {
		long ret = bindings.UpdateAddHTLC_clone(this.ptr);
		UpdateAddHTLC ret_hu_conv = new UpdateAddHTLC(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public byte[] get_channel_id() {
		byte[] ret = bindings.UpdateAddHTLC_get_channel_id(this.ptr);
		return ret;
	}

	public void set_channel_id(byte[] val) {
		bindings.UpdateAddHTLC_set_channel_id(this.ptr, val);
	}

	public long get_htlc_id() {
		long ret = bindings.UpdateAddHTLC_get_htlc_id(this.ptr);
		return ret;
	}

	public void set_htlc_id(long val) {
		bindings.UpdateAddHTLC_set_htlc_id(this.ptr, val);
	}

	public long get_amount_msat() {
		long ret = bindings.UpdateAddHTLC_get_amount_msat(this.ptr);
		return ret;
	}

	public void set_amount_msat(long val) {
		bindings.UpdateAddHTLC_set_amount_msat(this.ptr, val);
	}

	public byte[] get_payment_hash() {
		byte[] ret = bindings.UpdateAddHTLC_get_payment_hash(this.ptr);
		return ret;
	}

	public void set_payment_hash(byte[] val) {
		bindings.UpdateAddHTLC_set_payment_hash(this.ptr, val);
	}

	public int get_cltv_expiry() {
		int ret = bindings.UpdateAddHTLC_get_cltv_expiry(this.ptr);
		return ret;
	}

	public void set_cltv_expiry(int val) {
		bindings.UpdateAddHTLC_set_cltv_expiry(this.ptr, val);
	}

	public byte[] write() {
		byte[] ret = bindings.UpdateAddHTLC_write(this.ptr);
		return ret;
	}

	public static UpdateAddHTLC constructor_read(byte[] ser) {
		long ret = bindings.UpdateAddHTLC_read(ser);
		UpdateAddHTLC ret_hu_conv = new UpdateAddHTLC(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

}
