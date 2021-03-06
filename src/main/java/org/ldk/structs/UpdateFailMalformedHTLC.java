package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class UpdateFailMalformedHTLC extends CommonBase {
	UpdateFailMalformedHTLC(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.UpdateFailMalformedHTLC_free(ptr); }
	}

	public UpdateFailMalformedHTLC clone() {
		long ret = bindings.UpdateFailMalformedHTLC_clone(this.ptr);
		UpdateFailMalformedHTLC ret_hu_conv = new UpdateFailMalformedHTLC(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public byte[] get_channel_id() {
		byte[] ret = bindings.UpdateFailMalformedHTLC_get_channel_id(this.ptr);
		return ret;
	}

	public void set_channel_id(byte[] val) {
		bindings.UpdateFailMalformedHTLC_set_channel_id(this.ptr, val);
	}

	public long get_htlc_id() {
		long ret = bindings.UpdateFailMalformedHTLC_get_htlc_id(this.ptr);
		return ret;
	}

	public void set_htlc_id(long val) {
		bindings.UpdateFailMalformedHTLC_set_htlc_id(this.ptr, val);
	}

	public short get_failure_code() {
		short ret = bindings.UpdateFailMalformedHTLC_get_failure_code(this.ptr);
		return ret;
	}

	public void set_failure_code(short val) {
		bindings.UpdateFailMalformedHTLC_set_failure_code(this.ptr, val);
	}

	public byte[] write() {
		byte[] ret = bindings.UpdateFailMalformedHTLC_write(this.ptr);
		return ret;
	}

	public static UpdateFailMalformedHTLC constructor_read(byte[] ser) {
		long ret = bindings.UpdateFailMalformedHTLC_read(ser);
		UpdateFailMalformedHTLC ret_hu_conv = new UpdateFailMalformedHTLC(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

}
