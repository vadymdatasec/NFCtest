public class e.h.b.a.q.c extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.orange.hce.proto.widget.PackIdWidgetService$b a; //synthetic
	 /* # direct methods */
	 public e.h.b.a.q.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0, Object p1, Integer p2 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( e.h.b.a.m.d ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V
		 /* .line 2 */
		 p2 = this.a;
		 com.orange.hce.proto.widget.PackIdWidgetService$b .b ( );
		 /* new-instance v1, Le/h/b/a/q/b; */
		 /* invoke-direct {v1, p0, p1}, Le/h/b/a/q/b;-><init>(Le/h/b/a/q/c;Le/h/b/a/m/d;)V */
		 com.orange.hce.proto.widget.PackIdWidgetService$b .a ( p2,p1,v0,p3,v1 );
		 return;
	 } // .end method
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 9 */
		 final String v0 = "eventType"; // const-string v0, "eventType"
		 /* .line 1 */
		 (( android.content.Intent ) p2 ).getSerializableExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
		 /* check-cast v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
		 final String v1 = "zoneId"; // const-string v1, "zoneId"
		 /* .line 2 */
		 (( android.content.Intent ) p2 ).getSerializableExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
		 /* check-cast v1, Lfr/mbs/binary/Octets; */
		 final String v2 = "contactlessId"; // const-string v2, "contactlessId"
		 /* .line 3 */
		 (( android.content.Intent ) p2 ).getSerializableExtra ( v2 ); // invoke-virtual {p2, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
		 /* check-cast v2, Lfr/mbs/binary/Octets; */
		 final String v3 = "message"; // const-string v3, "message"
		 /* .line 4 */
		 (( android.content.Intent ) p2 ).getStringExtra ( v3 ); // invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 final String v4 = "timeout"; // const-string v4, "timeout"
		 /* .line 5 */
		 (( android.content.Intent ) p2 ).getSerializableExtra ( v4 ); // invoke-virtual {p2, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
		 /* check-cast p2, Ljava/lang/Integer; */
		 /* .line 6 */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v5 = "received transaction event "; // const-string v5, "received transaction event "
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v5 = " for contactlessId "; // const-string v5, " for contactlessId "
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v5 = " and zoneId "; // const-string v5, " and zoneId "
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v5 = "PackIdWidgetItemFactory"; // const-string v5, "PackIdWidgetItemFactory"
		 android.util.Log .d ( v5,v4 );
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* .line 7 */
			 com.orange.hce.proto.widget.PackIdWidgetService$b .a ( );
		 } // :cond_0
	 v5 = 	 } // :goto_0
	 if ( v5 != null) { // if-eqz v5, :cond_4
		 /* check-cast v5, Le/h/b/a/m/d; */
		 /* .line 8 */
		 (( e.h.b.a.m.d ) v5 ).d ( ); // invoke-virtual {v5}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
		 v6 = 		 (( fr.mbs.binary.Octets ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
		 if ( v6 != null) { // if-eqz v6, :cond_0
			 (( e.h.b.a.m.d ) v5 ).a ( ); // invoke-virtual {v5}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
			 v6 = 			 (( fr.mbs.binary.Octets ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
			 if ( v6 != null) { // if-eqz v6, :cond_0
				 /* .line 9 */
				 v6 = com.orange.hce.proto.widget.PackIdWidgetService$a.b;
				 v7 = 				 (( java.lang.Enum ) v0 ).ordinal ( ); // invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I
				 /* aget v6, v6, v7 */
				 int v7 = 1; // const/4 v7, 0x1
				 /* if-eq v6, v7, :cond_3 */
				 int v7 = 2; // const/4 v7, 0x2
				 /* const/16 v8, 0xbb8 */
				 /* if-eq v6, v7, :cond_2 */
				 int v7 = 3; // const/4 v7, 0x3
				 /* if-eq v6, v7, :cond_1 */
				 int v7 = 4; // const/4 v7, 0x4
				 /* if-eq v6, v7, :cond_1 */
				 int v7 = 5; // const/4 v7, 0x5
				 /* if-eq v6, v7, :cond_1 */
				 /* .line 10 */
			 } // :cond_1
			 (( e.h.b.a.m.d ) v5 ).b ( v3 ); // invoke-virtual {v5, v3}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V
			 /* .line 11 */
			 v6 = e.h.b.a.m.i.e;
			 (( e.h.b.a.m.i ) v6 ).a ( v3 ); // invoke-virtual {v6, v3}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;
			 (( e.h.b.a.q.c ) p0 ).a ( v5, v6, v8 ); // invoke-virtual {p0, v5, v6, v8}, Le/h/b/a/q/c;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
			 /* .line 12 */
			 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
			 e.h.b.a.q.d .c ( v5 );
			 /* .line 13 */
		 } // :cond_2
		 (( e.h.b.a.m.d ) v5 ).b ( v3 ); // invoke-virtual {v5, v3}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V
		 /* .line 14 */
		 v6 = e.h.b.a.m.i.f;
		 (( e.h.b.a.m.i ) v6 ).a ( v3 ); // invoke-virtual {v6, v3}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;
		 (( e.h.b.a.q.c ) p0 ).a ( v5, v6, v8 ); // invoke-virtual {p0, v5, v6, v8}, Le/h/b/a/q/c;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
		 /* .line 15 */
		 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 e.h.b.a.q.d .c ( v5 );
		 /* .line 16 */
	 } // :cond_3
	 v6 = e.h.b.a.m.i.g;
	 v7 = 	 (( java.lang.Integer ) p2 ).intValue ( ); // invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
	 /* add-int/lit16 v7, v7, 0x3e8 */
	 (( e.h.b.a.q.c ) p0 ).a ( v5, v6, v7 ); // invoke-virtual {p0, v5, v6, v7}, Le/h/b/a/q/c;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
	 /* .line 17 */
	 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
	 e.h.b.a.q.d .c ( v5 );
} // :cond_4
return;
} // .end method
