public class com.orange.oab.contactless.packid.intent.ContactlessTransactionReceiver extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.intent.ContactlessTransactionReceiver ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 public static android.app.PendingIntent a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .line 21 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.orange.oab.contactless.packid.action.SHOW_BADGE"; // const-string v1, "com.orange.oab.contactless.packid.action.SHOW_BADGE"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v1 = "badge"; // const-string v1, "badge"
		 /* .line 22 */
		 (( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 int p1 = 0; // const/4 p1, 0x0
		 /* const/high16 v1, 0x4000000 */
		 /* .line 23 */
		 android.app.PendingIntent .getBroadcast ( p0,p1,v0,v1 );
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.content.Context p0, com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p1, java.lang.Integer p2, java.lang.String p3, java.lang.String p4 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 e.h.d.a.a.q.i .a ( p1,p2,p3,p4 );
		 /* .line 2 */
		 v0 = 		 (( com.orange.oab.contactless.packid.intent.ContactlessTransactionReceiver ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Z
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 v0 = e.h.d.a.a.r.b.i;
		 (( e.h.d.a.a.r.b ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/b;->c(Landroid/content/Context;)V
		 /* .line 4 */
	 } // :cond_0
	 (( com.orange.oab.contactless.packid.intent.ContactlessTransactionReceiver ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Landroid/content/Context;Le/h/d/a/a/q/c;)V
	 /* .line 5 */
	 p2 = 	 (( com.orange.oab.contactless.packid.intent.ContactlessTransactionReceiver ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Z
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 6 */
		 (( com.orange.oab.contactless.packid.intent.ContactlessTransactionReceiver ) p0 ).a ( p1, p4, p5 ); // invoke-virtual {p0, p1, p4, p5}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
	 } // :cond_1
	 return;
} // .end method
public final void a ( android.content.Context p0, Object p1 ) {
	 /* .locals 3 */
	 /* .line 8 */
	 v0 = e.h.d.a.a.r.b.j;
	 (( e.h.d.a.a.r.b ) v0 ).f ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/b;->f(Landroid/content/Context;)Lc/h/e/c0$a;
	 /* .line 9 */
	 (( e.h.d.a.a.q.c ) p2 ).b ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c;->b()Ljava/lang/String;
	 (( c.h.e.c0$a ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
	 /* .line 10 */
	 (( e.h.d.a.a.q.c ) p2 ).e ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c;->e()[J
	 (( c.h.e.c0$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/e/c0$a;->a([J)Lc/h/e/c0$a;
	 /* .line 11 */
	 v1 = 	 (( e.h.d.a.a.q.c ) p2 ).d ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c;->d()I
	 /* int-to-long v1, v1 */
	 (( c.h.e.c0$a ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/h/e/c0$a;->a(J)Lc/h/e/c0$a;
	 /* .line 12 */
	 v1 = 	 (( e.h.d.a.a.q.c ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c;->a()I
	 (( c.h.e.c0$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/e/c0$a;->a(I)Lc/h/e/c0$a;
	 /* .line 13 */
	 (( e.h.d.a.a.q.c ) p2 ).c ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c;->c()Le/h/d/a/a/q/c$a;
	 v1 = 	 (( e.h.d.a.a.q.c$a ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/q/c$a;->b()I
	 (( e.h.d.a.a.q.c ) p2 ).c ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c;->c()Le/h/d/a/a/q/c$a;
	 v2 = 	 (( e.h.d.a.a.q.c$a ) v2 ).a ( ); // invoke-virtual {v2}, Le/h/d/a/a/q/c$a;->a()I
	 (( e.h.d.a.a.q.c ) p2 ).c ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c;->c()Le/h/d/a/a/q/c$a;
	 p2 = 	 (( e.h.d.a.a.q.c$a ) p2 ).c ( ); // invoke-virtual {p2}, Le/h/d/a/a/q/c$a;->c()Z
	 (( c.h.e.c0$a ) v0 ).a ( v1, v2, p2 ); // invoke-virtual {v0, v1, v2, p2}, Lc/h/e/c0$a;->a(IIZ)Lc/h/e/c0$a;
	 /* .line 14 */
	 (( c.h.e.c0$a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/e/c0$a;->a()Landroid/app/Notification;
	 /* .line 15 */
	 v0 = e.h.d.a.a.r.b.j;
	 (( e.h.d.a.a.r.b ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;)V
	 return;
} // .end method
public final void a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
	 /* .locals 1 */
	 /* .line 16 */
	 v0 = e.h.d.a.a.r.b.i;
	 (( e.h.d.a.a.r.b ) v0 ).f ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/b;->f(Landroid/content/Context;)Lc/h/e/c0$a;
	 /* .line 17 */
	 (( c.h.e.c0$a ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
	 /* .line 18 */
	 com.orange.oab.contactless.packid.intent.ContactlessTransactionReceiver .a ( p1,p3 );
	 (( c.h.e.c0$a ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;
	 /* .line 19 */
	 (( c.h.e.c0$a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/e/c0$a;->a()Landroid/app/Notification;
	 /* .line 20 */
	 p3 = e.h.d.a.a.r.b.i;
	 (( e.h.d.a.a.r.b ) p3 ).a ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;)V
	 return;
} // .end method
public final Boolean a ( com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p0 ) {
	 /* .locals 1 */
	 /* .line 7 */
	 v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.DONE;
	 p1 = 	 (( java.lang.Enum ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
	 /* .locals 7 */
	 final String v0 = "eventType"; // const-string v0, "eventType"
	 /* .line 1 */
	 (( android.content.Intent ) p2 ).getSerializableExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
	 /* move-object v3, v0 */
	 /* check-cast v3, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
	 final String v0 = "timeout"; // const-string v0, "timeout"
	 /* .line 2 */
	 (( android.content.Intent ) p2 ).getSerializableExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
	 /* move-object v4, v0 */
	 /* check-cast v4, Ljava/lang/Integer; */
	 final String v0 = "message"; // const-string v0, "message"
	 /* .line 3 */
	 (( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 final String v0 = "badge"; // const-string v0, "badge"
	 /* .line 4 */
	 (( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 5 */
	 /* new-instance p2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v0 = "Receive contactless transaction event with type "; // const-string v0, "Receive contactless transaction event with type "
	 (( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).append ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v0 = "packid.notif"; // const-string v0, "packid.notif"
	 android.util.Log .i ( v0,p2 );
	 /* move-object v1, p0 */
	 /* move-object v2, p1 */
	 /* .line 6 */
	 /* invoke-virtual/range {v1 ..v6}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
