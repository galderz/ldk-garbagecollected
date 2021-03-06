package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class Result_AcceptChannelDecodeErrorZ extends CommonBase {
	private Result_AcceptChannelDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_AcceptChannelDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_AcceptChannelDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_AcceptChannelDecodeErrorZ_result_ok(ptr)) {
			return new Result_AcceptChannelDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_AcceptChannelDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_AcceptChannelDecodeErrorZ_OK extends Result_AcceptChannelDecodeErrorZ {
		public final AcceptChannel res;
		private Result_AcceptChannelDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_AcceptChannelDecodeErrorZ_get_ok(ptr);
			AcceptChannel res_hu_conv = new AcceptChannel(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_AcceptChannelDecodeErrorZ_OK(AcceptChannel res) {
			this(null, bindings.CResult_AcceptChannelDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_AcceptChannelDecodeErrorZ_Err extends Result_AcceptChannelDecodeErrorZ {
		public final DecodeError err;
		private Result_AcceptChannelDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_AcceptChannelDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_AcceptChannelDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_AcceptChannelDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}