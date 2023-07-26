public class com.orange.oab.contactless.packid.report.ReportSender {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static com.orange.oab.contactless.packid.report.ReportSenderHandler a;
	 /* # direct methods */
	 public static com.orange.oab.contactless.packid.report.ReportSender ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/h/d/a/a/u/a; */
		 /* invoke-direct {v0}, Le/h/d/a/a/u/a;-><init>()V */
		 return;
	 } // .end method
	 public static void init ( com.orange.oab.contactless.packid.report.ReportSenderHandler p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public static void send ( java.lang.String p0, java.lang.Throwable p1 ) {
		 /* .locals 1 */
		 final String v0 = "packid.ReportSender"; // const-string v0, "packid.ReportSender"
		 /* .line 1 */
		 android.util.Log .w ( v0,p0,p1 );
		 /* .line 2 */
		 v0 = com.orange.oab.contactless.packid.report.ReportSender.a;
		 return;
	 } // .end method
