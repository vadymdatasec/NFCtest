public class com.orange.oab.contactless.packid.debug.DebugConsole {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final com.orange.oab.contactless.packid.debug.DebugConsole b;
	 /* # instance fields */
	 public com.orange.oab.contactless.packid.debug.DebugConsolePrinter a;
	 /* # direct methods */
	 public static com.orange.oab.contactless.packid.debug.DebugConsole ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lcom/orange/oab/contactless/packid/debug/DebugConsole; */
		 /* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;-><init>()V */
		 return;
	 } // .end method
	 public com.orange.oab.contactless.packid.debug.DebugConsole ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Le/h/d/a/a/j/a; */
		 /* invoke-direct {v0}, Le/h/d/a/a/j/a;-><init>()V */
		 this.a = v0;
		 return;
	 } // .end method
	 public static void initLogScreenPrinter ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = com.orange.oab.contactless.packid.debug.DebugConsole.b;
		 /* new-instance v1, Le/h/d/a/a/j/b; */
		 /* invoke-direct {v1, p0}, Le/h/d/a/a/j/b;-><init>(Landroid/content/Context;)V */
		 this.a = v1;
		 return;
	 } // .end method
	 public static void log ( java.lang.String p0, Integer p1, java.lang.String p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 v0 = com.orange.oab.contactless.packid.debug.DebugConsole.b;
		 v0 = this.a;
		 return;
	 } // .end method
	 public static void log ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = com.orange.oab.contactless.packid.debug.DebugConsole.b;
		 v0 = this.a;
		 return;
	 } // .end method
	 public static void log ( java.lang.String p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = com.orange.oab.contactless.packid.debug.DebugConsole.b;
		 v0 = this.a;
		 return;
	 } // .end method
	 public static void resetLogScreenPrinter ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = com.orange.oab.contactless.packid.debug.DebugConsole.b;
		 /* new-instance v1, Le/h/d/a/a/j/a; */
		 /* invoke-direct {v1}, Le/h/d/a/a/j/a;-><init>()V */
		 this.a = v1;
		 return;
	 } // .end method
