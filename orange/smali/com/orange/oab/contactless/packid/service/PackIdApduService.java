public class com.orange.oab.contactless.packid.service.PackIdApduService extends android.nfc.cardemulation.HostApduService {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Integer d;
	 /* # instance fields */
	 public e.h.d.a.a.w.m b;
	 public java.util.concurrent.ScheduledExecutorService c;
	 /* # direct methods */
	 public static com.orange.oab.contactless.packid.service.PackIdApduService ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public com.orange.oab.contactless.packid.service.PackIdApduService ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/nfc/cardemulation/HostApduService;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( com.orange.oab.contactless.packid.service.PackIdApduService p0 ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->d()V */
		 return;
	 } // .end method
	 private void d ( ) { //synthethic
		 /* .locals 2 */
		 final String v0 = "autoDeactivate"; // const-string v0, "autoDeactivate"
		 final String v1 = "packid.nfc.ApduService"; // const-string v1, "packid.nfc.ApduService"
		 /* .line 1 */
		 android.util.Log .i ( v1,v0 );
		 /* .line 2 */
		 com.orange.oab.contactless.packid.debug.DebugConsole .log ( v1,v0 );
		 /* .line 3 */
		 (( com.orange.oab.contactless.packid.service.PackIdApduService ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( Integer p0 ) {
		 /* .locals 2 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int v0 = 1; // const/4 v0, 0x1
			 /* if-eq p1, v0, :cond_0 */
			 /* .line 1 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "Unknown: "; // const-string v1, "Unknown: "
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 } // :cond_0
		 final String p1 = "DEACTIVATION_DESELECTED"; // const-string p1, "DEACTIVATION_DESELECTED"
	 } // :cond_1
	 final String p1 = "DEACTIVATION_LINK_LOSS"; // const-string p1, "DEACTIVATION_LINK_LOSS"
} // .end method
public final void a ( ) {
	 /* .locals 4 */
	 /* .line 2 */
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 /* .line 4 */
		 try { // :try_start_0
			 v0 = this.c;
			 /* const-wide/16 v1, 0x1 */
			 v3 = java.util.concurrent.TimeUnit.SECONDS;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 final String v1 = "packid.nfc.ApduService"; // const-string v1, "packid.nfc.ApduService"
			 final String v2 = "Current thread has been interrupted, could not wait for auto deactivate executor termination"; // const-string v2, "Current thread has been interrupted, could not wait for auto deactivate executor termination"
			 /* .line 5 */
			 android.util.Log .w ( v1,v2,v0 );
			 /* .line 6 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
public final void b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( e.h.d.a.a.w.m ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/w/m;->a()V
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 this.b = v0;
	 } // :cond_0
	 return;
} // .end method
public final void c ( ) {
	 /* .locals 5 */
	 /* .line 1 */
	 (( com.orange.oab.contactless.packid.service.PackIdApduService ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->a()V
	 /* .line 2 */
	 java.util.concurrent.Executors .newSingleThreadScheduledExecutor ( );
	 this.c = v0;
	 /* .line 3 */
	 /* new-instance v1, Le/h/d/a/a/w/b; */
	 /* invoke-direct {v1, p0}, Le/h/d/a/a/w/b;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdApduService;)V */
	 /* int-to-long v2, v2 */
	 v4 = java.util.concurrent.TimeUnit.MILLISECONDS;
	 return;
} // .end method
public void onCreate ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-super {p0}, Landroid/nfc/cardemulation/HostApduService;->onCreate()V */
	 final String v0 = "packid.nfc.ApduService"; // const-string v0, "packid.nfc.ApduService"
	 final String v1 = "start service"; // const-string v1, "start service"
	 /* .line 2 */
	 android.util.Log .i ( v0,v1 );
	 return;
} // .end method
public void onDeactivated ( Integer p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "onDeactivated because "; // const-string v1, "onDeactivated because "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( com.orange.oab.contactless.packid.service.PackIdApduService ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->a(I)Ljava/lang/String;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v0 = "packid.nfc.ApduService"; // const-string v0, "packid.nfc.ApduService"
	 android.util.Log .i ( v0,p1 );
	 final String p1 = "onDeactivated"; // const-string p1, "onDeactivated"
	 /* .line 2 */
	 com.orange.oab.contactless.packid.debug.DebugConsole .log ( v0,p1 );
	 /* .line 3 */
	 (( com.orange.oab.contactless.packid.service.PackIdApduService ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->a()V
	 /* .line 4 */
	 (( com.orange.oab.contactless.packid.service.PackIdApduService ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->b()V
	 return;
} // .end method
public void onDestroy ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-super {p0}, Landroid/nfc/cardemulation/HostApduService;->onDestroy()V */
	 final String v0 = "packid.nfc.ApduService"; // const-string v0, "packid.nfc.ApduService"
	 final String v1 = "desstroy service"; // const-string v1, "desstroy service"
	 /* .line 2 */
	 android.util.Log .i ( v0,v1 );
	 return;
} // .end method
public processCommandApdu ( Object[] p0, android.os.Bundle p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance p2, Le/h/d/a/a/o/a/q; */
	 final String v0 = "processCommandApdu"; // const-string v0, "processCommandApdu"
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {p2, p0, v0, v1}, Le/h/d/a/a/o/a/q;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V */
	 final String v0 = "NfcSession"; // const-string v0, "NfcSession"
	 (( e.h.d.a.a.o.a.q ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/h/d/a/a/o/a/q;->a(Ljava/lang/String;)Le/h/d/a/a/o/a/q;
	 /* .line 2 */
	 v0 = this.b;
	 /* if-nez v0, :cond_0 */
	 /* .line 3 */
	 /* new-instance v0, Le/h/d/a/a/w/m; */
	 /* invoke-direct {v0, p0}, Le/h/d/a/a/w/m;-><init>(Landroid/content/Context;)V */
	 this.b = v0;
	 /* .line 4 */
} // :cond_0
v0 = this.b;
(( e.h.d.a.a.w.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/w/m;->a([B)[B
/* .line 5 */
(( com.orange.oab.contactless.packid.service.PackIdApduService ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->c()V
/* .line 6 */
(( e.h.d.a.a.o.a.q ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/o/a/q;->a()V
} // .end method
