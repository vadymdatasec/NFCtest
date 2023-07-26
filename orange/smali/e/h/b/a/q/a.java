public class e.h.b.a.q.a extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.b.a.q.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 5 */
		 final String v0 = "zoneId"; // const-string v0, "zoneId"
		 /* .line 1 */
		 (( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 fr.mbs.binary.Octets .createOctets ( v0 );
		 final String v1 = "contactlessId"; // const-string v1, "contactlessId"
		 /* .line 2 */
		 (( android.content.Intent ) p2 ).getStringExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 fr.mbs.binary.Octets .createOctets ( v1 );
		 final String v2 = "rssiLevel"; // const-string v2, "rssiLevel"
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 3 */
		 p2 = 		 (( android.content.Intent ) p2 ).getIntExtra ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
		 /* .line 4 */
		 com.orange.hce.proto.widget.PackIdWidgetService$b .a ( );
	 } // :cond_0
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* check-cast v3, Le/h/b/a/m/d; */
	 /* .line 5 */
	 (( e.h.b.a.m.d ) v3 ).d ( ); // invoke-virtual {v3}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
	 v4 = 	 (( fr.mbs.binary.Octets ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
	 if ( v4 != null) { // if-eqz v4, :cond_0
		 (( e.h.b.a.m.d ) v3 ).a ( ); // invoke-virtual {v3}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
		 v4 = 		 (( fr.mbs.binary.Octets ) v4 ).equals ( v0 ); // invoke-virtual {v4, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 6 */
			 com.orange.oab.contactless.packid.rssi.RssiLevel .values ( );
			 /* aget-object v4, v4, p2 */
			 (( e.h.b.a.m.d ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/h/b/a/m/d;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
			 final String v3 = "PackIdWidgetItemFactory"; // const-string v3, "PackIdWidgetItemFactory"
			 final String v4 = "Update widget"; // const-string v4, "Update widget"
			 /* .line 7 */
			 android.util.Log .d ( v3,v4 );
			 /* .line 8 */
			 e.h.b.a.q.d .c ( p1 );
		 } // :cond_1
		 return;
	 } // .end method
