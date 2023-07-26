public abstract class e.f.a.d.a.b.z2.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.a.d.a.b.z2.a ( ) {
/* .locals 14 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v0 = e.f.a.d.a.b.z2.a.a;
int v1 = -1; // const/4 v1, -0x1
java.lang.Integer .valueOf ( v1 );
final String v2 = "The requesting app is unavailable (e.g.unpublished, nonexistent version code)."; // const-string v2, "The requesting app is unavailable (e.g.unpublished, nonexistent version code)."
v0 = e.f.a.d.a.b.z2.a.a;
int v2 = -2; // const/4 v2, -0x2
java.lang.Integer .valueOf ( v2 );
final String v3 = "The requested pack is not available."; // const-string v3, "The requested pack is not available."
v0 = e.f.a.d.a.b.z2.a.a;
int v3 = -3; // const/4 v3, -0x3
java.lang.Integer .valueOf ( v3 );
final String v4 = "The request is invalid."; // const-string v4, "The request is invalid."
v0 = e.f.a.d.a.b.z2.a.a;
int v4 = -4; // const/4 v4, -0x4
java.lang.Integer .valueOf ( v4 );
final String v5 = "The requested download is not found."; // const-string v5, "The requested download is not found."
v0 = e.f.a.d.a.b.z2.a.a;
int v5 = -5; // const/4 v5, -0x5
java.lang.Integer .valueOf ( v5 );
final String v6 = "The Asset Delivery API is not available."; // const-string v6, "The Asset Delivery API is not available."
v0 = e.f.a.d.a.b.z2.a.a;
int v6 = -6; // const/4 v6, -0x6
java.lang.Integer .valueOf ( v6 );
final String v7 = "Network error.Unable to obtain the asset pack details."; // const-string v7, "Network error.Unable to obtain the asset pack details."
v0 = e.f.a.d.a.b.z2.a.a;
int v7 = -7; // const/4 v7, -0x7
java.lang.Integer .valueOf ( v7 );
final String v8 = "Download not permitted under current device circumstances (e.g.in background)."; // const-string v8, "Download not permitted under current device circumstances (e.g.in background)."
v0 = e.f.a.d.a.b.z2.a.a;
/* const/16 v8, -0xa */
java.lang.Integer .valueOf ( v8 );
final String v9 = "Asset pack download failed due to insufficient storage."; // const-string v9, "Asset pack download failed due to insufficient storage."
v0 = e.f.a.d.a.b.z2.a.a;
/* const/16 v9, -0xb */
java.lang.Integer .valueOf ( v9 );
final String v10 = "The Play Store app is either not installed or not the official version."; // const-string v10, "The Play Store app is either not installed or not the official version."
v0 = e.f.a.d.a.b.z2.a.a;
/* const/16 v10, -0xc */
java.lang.Integer .valueOf ( v10 );
final String v11 = "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi."; // const-string v11, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi."
v0 = e.f.a.d.a.b.z2.a.a;
/* const/16 v11, -0xd */
java.lang.Integer .valueOf ( v11 );
final String v12 = "The app is not owned by any user on this device.An app is \"owned\" if it has been acquired from Play."; // const-string v12, "The app is not owned by any user on this device.An app is \"owned\" if it has been acquired from Play."
v0 = e.f.a.d.a.b.z2.a.a;
/* const/16 v12, -0x64 */
java.lang.Integer .valueOf ( v12 );
final String v13 = "Unknown error downloading an asset pack."; // const-string v13, "Unknown error downloading an asset pack."
v0 = e.f.a.d.a.b.z2.a.b;
final String v13 = "APP_UNAVAILABLE"; // const-string v13, "APP_UNAVAILABLE"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "PACK_UNAVAILABLE"; // const-string v1, "PACK_UNAVAILABLE"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "INVALID_REQUEST"; // const-string v1, "INVALID_REQUEST"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "DOWNLOAD_NOT_FOUND"; // const-string v1, "DOWNLOAD_NOT_FOUND"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "API_NOT_AVAILABLE"; // const-string v1, "API_NOT_AVAILABLE"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "NETWORK_ERROR"; // const-string v1, "NETWORK_ERROR"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "ACCESS_DENIED"; // const-string v1, "ACCESS_DENIED"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "INSUFFICIENT_STORAGE"; // const-string v1, "INSUFFICIENT_STORAGE"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "PLAY_STORE_NOT_FOUND"; // const-string v1, "PLAY_STORE_NOT_FOUND"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "NETWORK_UNRESTRICTED"; // const-string v1, "NETWORK_UNRESTRICTED"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "APP_NOT_OWNED"; // const-string v1, "APP_NOT_OWNED"
v0 = e.f.a.d.a.b.z2.a.b;
final String v1 = "INTERNAL_ERROR"; // const-string v1, "INTERNAL_ERROR"
return;
} // .end method
public static java.lang.String a ( Integer p0 ) {
/* .locals 4 */
v0 = e.f.a.d.a.b.z2.a.a;
v0 = java.lang.Integer .valueOf ( p0 );
/* if-nez v0, :cond_0 */
final String p0 = ""; // const-string p0, ""
} // :cond_0
v0 = e.f.a.d.a.b.z2.a.a;
/* check-cast v0, Ljava/lang/String; */
v1 = e.f.a.d.a.b.z2.a.b;
/* check-cast p0, Ljava/lang/String; */
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
java.lang.String .valueOf ( p0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* new-instance v3, Ljava/lang/StringBuilder; */
/* add-int/lit8 v1, v1, 0x71 */
/* add-int/2addr v1, v2 */
/* invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " ("; // const-string v0, " ("
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html"; // const-string v0, "https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "#"; // const-string v0, "#"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = ")"; // const-string p0, ")"
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
