
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_SignatureNoneZ extends CommonBase {
	private Result_SignatureNoneZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_SignatureNoneZ_free(ptr); } super.finalize();
	}

	static Result_SignatureNoneZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_SignatureNoneZ_result_ok(ptr)) {
			return new Result_SignatureNoneZ_OK(null, ptr);
		} else {
			return new Result_SignatureNoneZ_Err(null, ptr);
		}
	}
	public static final class Result_SignatureNoneZ_OK extends Result_SignatureNoneZ {
		public final Uint8Array res;
		private Result_SignatureNoneZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			this.res = bindings.LDKCResult_SignatureNoneZ_get_ok(ptr);
		}
		public Result_SignatureNoneZ_OK(Uint8Array res) {
			this(null, bindings.CResult_SignatureNoneZ_ok(res));
		}
	}

	public static final class Result_SignatureNoneZ_Err extends Result_SignatureNoneZ {
		private Result_SignatureNoneZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
		}
		public Result_SignatureNoneZ_Err() {
			this(null, bindings.CResult_SignatureNoneZ_err());
		}
	}
}
