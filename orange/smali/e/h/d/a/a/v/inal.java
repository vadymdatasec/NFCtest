public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 public java.lang.String b;
	 public android.content.Context c;
	 public final java.lang.String d;
	 public java.util.Timer e;
	 public java.util.Date f;
	 public com.orange.oab.contactless.packid.rssi.RssiLevel g;
	 public android.bluetooth.BluetoothDevice h;
	 public com.orange.oab.contactless.packid.rssi.RssiLevel i;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 /* .line 5 */
		 /* const-class p1, Le/h/d/a/a/v/f; */
		 (( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 this.d = p1;
		 /* .line 6 */
		 p1 = com.orange.oab.contactless.packid.rssi.RssiLevel.ZERO;
		 this.g = p1;
		 /* .line 7 */
		 this.i = p1;
		 return;
	 } // .end method
	 public static final java.lang.String a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.d;
	 } // .end method
	 public static final void a ( Object p0, com.orange.oab.contactless.packid.rssi.RssiLevel p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 this.g = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 v0 = this.a;
	 } // .end method
	 public final void a ( android.bluetooth.BluetoothDevice p0 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 this.h = p1;
		 return;
	 } // .end method
	 public final void a ( android.content.Context p0 ) {
		 /* .locals 4 */
		 final String v0 = "context"; // const-string v0, "context"
		 i.h.c.k .c ( p1,v0 );
		 /* .line 11 */
		 v0 = this.d;
		 v1 = this.b;
		 final String v2 = "forcing update for zone "; // const-string v2, "forcing update for zone "
		 i.h.c.k .a ( v2,v1 );
		 android.util.Log .d ( v0,v1 );
		 /* .line 12 */
		 /* new-instance v0, Le/h/d/a/a/r/a; */
		 /* invoke-direct {v0, p1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
		 /* .line 13 */
		 p1 = this.h;
		 /* .line 14 */
		 v1 = this.b;
		 /* .line 15 */
		 v2 = this.a;
		 /* .line 16 */
		 v3 = this.g;
		 /* .line 17 */
		 (( e.h.d.a.a.r.a ) v0 ).a ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Le/h/d/a/a/r/a;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
		 return;
	 } // .end method
	 public final void a ( com.orange.oab.contactless.packid.rssi.RssiLevel p0 ) {
		 /* .locals 5 */
		 final String v0 = "value"; // const-string v0, "value"
		 i.h.c.k .c ( p1,v0 );
		 /* .line 5 */
		 this.i = p1;
		 /* .line 6 */
		 v0 = this.f;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 7 */
			 /* new-instance v0, Ljava/util/Date; */
			 /* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
			 (( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
			 /* move-result-wide v0 */
			 v2 = this.f;
			 i.h.c.k .a ( v2 );
			 (( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
			 /* move-result-wide v2 */
			 /* sub-long/2addr v0, v2 */
			 /* long-to-double v0, v0 */
			 /* const-wide v2, 0x408f400000000000L # 1000.0 */
			 /* cmpl-double v4, v0, v2 */
			 /* if-ltz v4, :cond_0 */
			 /* .line 8 */
			 (( e.h.d.a.a.v.f ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/v/f;->b(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
			 /* .line 9 */
		 } // :cond_0
		 p1 = this.d;
		 final String v0 = "no update needed 1 second timeout is in effect"; // const-string v0, "no update needed 1 second timeout is in effect"
		 android.util.Log .d ( p1,v0 );
		 /* .line 10 */
	 } // :cond_1
	 (( e.h.d.a.a.v.f ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/v/f;->b(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
} // :goto_0
return;
} // .end method
public final android.content.Context b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public final void b ( com.orange.oab.contactless.packid.rssi.RssiLevel p0 ) {
/* .locals 4 */
/* .line 2 */
v0 = this.g;
/* if-eq p1, v0, :cond_0 */
/* .line 3 */
v0 = this.c;
/* .line 4 */
/* new-instance v1, Le/h/d/a/a/r/a; */
/* invoke-direct {v1, v0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
/* .line 5 */
(( e.h.d.a.a.v.f ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/v/f;->d()Landroid/bluetooth/BluetoothDevice;
/* .line 6 */
(( e.h.d.a.a.v.f ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/d/a/a/v/f;->e()Ljava/lang/String;
/* .line 7 */
(( e.h.d.a.a.v.f ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/v/f;->a()Ljava/lang/String;
/* .line 8 */
(( e.h.d.a.a.r.a ) v1 ).a ( v0, v2, v3, p1 ); // invoke-virtual {v1, v0, v2, v3, p1}, Le/h/d/a/a/r/a;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
/* .line 9 */
} // :cond_0
v0 = this.d;
final String v1 = "no Change In LEVEL detected"; // const-string v1, "no Change In LEVEL detected"
android.util.Log .d ( v0,v1 );
/* .line 10 */
} // :goto_0
this.g = p1;
/* .line 11 */
/* new-instance p1, Ljava/util/Date; */
/* invoke-direct {p1}, Ljava/util/Date;-><init>()V */
this.f = p1;
/* .line 12 */
(( e.h.d.a.a.v.f ) p0 ).f ( ); // invoke-virtual {p0}, Le/h/d/a/a/v/f;->f()V
return;
} // .end method
public final com.orange.oab.contactless.packid.rssi.RssiLevel c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public final android.bluetooth.BluetoothDevice d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public final java.lang.String e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final void f ( ) {
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.v.f ) p0 ).h ( ); // invoke-virtual {p0}, Le/h/d/a/a/v/f;->h()V
/* .line 2 */
(( e.h.d.a.a.v.f ) p0 ).g ( ); // invoke-virtual {p0}, Le/h/d/a/a/v/f;->g()V
return;
} // .end method
public final void g ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
this.e = v0;
/* .line 2 */
/* new-instance v1, Le/h/d/a/a/v/e; */
/* invoke-direct {v1, p0}, Le/h/d/a/a/v/e;-><init>(Le/h/d/a/a/v/f;)V */
/* const-wide/16 v2, 0xbb8 */
(( java.util.Timer ) v0 ).schedule ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
return;
} // .end method
public final void h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
} // :goto_0
return;
} // .end method
