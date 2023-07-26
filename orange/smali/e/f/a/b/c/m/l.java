public abstract class e.f.a.b.c.m.l {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.b.c.m.l ( ) {
		 /* .locals 2 */
		 final String v0 = "https://plus.google.com/"; // const-string v0, "https://plus.google.com/"
		 /* .line 1 */
		 android.net.Uri .parse ( v0 );
		 /* .line 2 */
		 (( android.net.Uri ) v0 ).buildUpon ( ); // invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
		 final String v1 = "circles"; // const-string v1, "circles"
		 (( android.net.Uri$Builder ) v0 ).appendPath ( v1 ); // invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
		 final String v1 = "find"; // const-string v1, "find"
		 (( android.net.Uri$Builder ) v0 ).appendPath ( v1 ); // invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
		 (( android.net.Uri$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
		 return;
	 } // .end method
	 public static android.content.Intent a ( ) {
		 /* .locals 2 */
		 /* .line 14 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"; // const-string v1, "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v1 = "com.google.android.wearable.app"; // const-string v1, "com.google.android.wearable.app"
		 /* .line 15 */
		 (( android.content.Intent ) v0 ).setPackage ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
	 } // .end method
	 public static android.content.Intent a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 final String v0 = "package"; // const-string v0, "package"
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 1 */
		 android.net.Uri .fromParts ( v0,p0,v1 );
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "android.settings.APPLICATION_DETAILS_SETTINGS"; // const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 /* .line 3 */
		 (( android.content.Intent ) v0 ).setData ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
	 } // .end method
	 public static android.content.Intent a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .line 4 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v1 = "market://details"; // const-string v1, "market://details"
		 /* .line 5 */
		 android.net.Uri .parse ( v1 );
		 /* .line 6 */
		 (( android.net.Uri ) v1 ).buildUpon ( ); // invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
		 final String v2 = "id"; // const-string v2, "id"
		 /* .line 7 */
		 (( android.net.Uri$Builder ) v1 ).appendQueryParameter ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
		 /* .line 8 */
		 v1 = 		 android.text.TextUtils .isEmpty ( p1 );
		 /* if-nez v1, :cond_0 */
		 final String v1 = "pcampaignid"; // const-string v1, "pcampaignid"
		 /* .line 9 */
		 (( android.net.Uri$Builder ) p0 ).appendQueryParameter ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
		 /* .line 10 */
	 } // :cond_0
	 (( android.net.Uri$Builder ) p0 ).build ( ); // invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
	 /* .line 11 */
	 (( android.content.Intent ) v0 ).setData ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
	 final String p0 = "com.android.vending"; // const-string p0, "com.android.vending"
	 /* .line 12 */
	 (( android.content.Intent ) v0 ).setPackage ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
	 /* const/high16 p0, 0x80000 */
	 /* .line 13 */
	 (( android.content.Intent ) v0 ).addFlags ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
} // .end method
