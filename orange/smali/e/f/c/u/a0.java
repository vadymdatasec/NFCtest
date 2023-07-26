public class e.f.c.u.a0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.os.Bundle a;
	 /* # direct methods */
	 public e.f.c.u.a0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 /* new-instance v0, Landroid/os/Bundle; */
			 /* invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
			 this.a = v0;
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/NullPointerException; */
		 final String v0 = "data"; // const-string v0, "data"
		 /* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public static Boolean a ( android.os.Bundle p0 ) {
		 /* .locals 3 */
		 final String v0 = "gcm.n.e"; // const-string v0, "gcm.n.e"
		 /* .line 25 */
		 (( android.os.Bundle ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 final String v2 = "1"; // const-string v2, "1"
		 v1 = 		 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v1, :cond_1 */
		 /* .line 26 */
		 e.f.c.u.a0 .l ( v0 );
		 (( android.os.Bundle ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 p0 = 		 (( java.lang.String ) v2 ).equals ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static Integer i ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 5 */
p0 = android.graphics.Color .parseColor ( p0 );
/* const/high16 v0, -0x1000000 */
/* if-eq p0, v0, :cond_0 */
/* .line 6 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Transparent color is invalid"; // const-string v0, "Transparent color is invalid"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean j ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "google.c.a."; // const-string v0, "google.c.a."
/* .line 5 */
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
final String v0 = "from"; // const-string v0, "from"
p0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static Boolean k ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "google.c."; // const-string v0, "google.c."
/* .line 1 */
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
final String v0 = "gcm.n."; // const-string v0, "gcm.n."
/* .line 2 */
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
final String v0 = "gcm.notification."; // const-string v0, "gcm.notification."
/* .line 3 */
p0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static java.lang.String l ( java.lang.String p0 ) {
/* .locals 2 */
final String v0 = "gcm.n."; // const-string v0, "gcm.n."
/* .line 1 */
v1 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
} // :cond_0
final String v1 = "gcm.notification."; // const-string v1, "gcm.notification."
/* .line 2 */
(( java.lang.String ) p0 ).replace ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
} // .end method
public static java.lang.String m ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "gcm.n."; // const-string v0, "gcm.n."
/* .line 1 */
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 6; // const/4 v0, 0x6
/* .line 2 */
(( java.lang.String ) p0 ).substring ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_0
} // .end method
/* # virtual methods */
public java.lang.String a ( android.content.res.Resources p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 5 */
/* .line 13 */
(( e.f.c.u.a0 ) p0 ).e ( p3 ); // invoke-virtual {p0, p3}, Le/f/c/u/a0;->e(Ljava/lang/String;)Ljava/lang/String;
/* .line 14 */
v1 = android.text.TextUtils .isEmpty ( v0 );
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
final String v1 = "string"; // const-string v1, "string"
/* .line 15 */
p2 = (( android.content.res.Resources ) p1 ).getIdentifier ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
final String v0 = " Default value will be used."; // const-string v0, " Default value will be used."
final String v1 = "NotificationParams"; // const-string v1, "NotificationParams"
/* if-nez p2, :cond_2 */
/* .line 16 */
java.lang.String .valueOf ( p3 );
final String p2 = "_loc_key"; // const-string p2, "_loc_key"
v3 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
if ( v3 != null) { // if-eqz v3, :cond_1
(( java.lang.String ) p1 ).concat ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
/* new-instance p2, Ljava/lang/String; */
/* invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, p2 */
/* .line 17 */
} // :goto_0
e.f.c.u.a0 .m ( p1 );
java.lang.String .valueOf ( p1 );
p2 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* add-int/lit8 p2, p2, 0x31 */
java.lang.String .valueOf ( p3 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/2addr p2, v3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, p2}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " resource not found: "; // const-string p1, " resource not found: "
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p3 ); // invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 18 */
android.util.Log .w ( v1,p1 );
/* .line 19 */
} // :cond_2
(( e.f.c.u.a0 ) p0 ).d ( p3 ); // invoke-virtual {p0, p3}, Le/f/c/u/a0;->d(Ljava/lang/String;)[Ljava/lang/Object;
/* if-nez v3, :cond_3 */
/* .line 20 */
(( android.content.res.Resources ) p1 ).getString ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 21 */
} // :cond_3
try { // :try_start_0
(( android.content.res.Resources ) p1 ).getString ( p2, v3 ); // invoke-virtual {p1, p2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/util/MissingFormatArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 22 */
e.f.c.u.a0 .m ( p3 );
/* .line 23 */
java.util.Arrays .toString ( v3 );
java.lang.String .valueOf ( p2 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, 0x3a */
java.lang.String .valueOf ( p3 );
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* add-int/2addr v3, v4 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Missing format argument for "; // const-string v3, "Missing format argument for "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ": "; // const-string p2, ": "
(( java.lang.StringBuilder ) v4 ).append ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p3 ); // invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 24 */
android.util.Log .w ( v1,p2,p1 );
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.u.a0 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "1"; // const-string v0, "1"
/* .line 2 */
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
p1 = java.lang.Boolean .parseBoolean ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public a ( ) {
/* .locals 8 */
final String v0 = ".Skipping setting LightSettings"; // const-string v0, ".Skipping setting LightSettings"
final String v1 = "LightSettings is invalid: "; // const-string v1, "LightSettings is invalid: "
final String v2 = "NotificationParams"; // const-string v2, "NotificationParams"
final String v3 = "gcm.n.light_settings"; // const-string v3, "gcm.n.light_settings"
/* .line 3 */
(( e.f.c.u.a0 ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Le/f/c/u/a0;->c(Ljava/lang/String;)Lorg/json/JSONArray;
int v4 = 0; // const/4 v4, 0x0
/* if-nez v3, :cond_0 */
} // :cond_0
int v5 = 3; // const/4 v5, 0x3
/* new-array v6, v5, [I */
/* .line 4 */
try { // :try_start_0
v7 = (( org.json.JSONArray ) v3 ).length ( ); // invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
/* if-ne v7, v5, :cond_1 */
int v5 = 0; // const/4 v5, 0x0
/* .line 5 */
(( org.json.JSONArray ) v3 ).optString ( v5 ); // invoke-virtual {v3, v5}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;
v7 = e.f.c.u.a0 .i ( v7 );
/* aput v7, v6, v5 */
int v5 = 1; // const/4 v5, 0x1
/* .line 6 */
v7 = (( org.json.JSONArray ) v3 ).optInt ( v5 ); // invoke-virtual {v3, v5}, Lorg/json/JSONArray;->optInt(I)I
/* aput v7, v6, v5 */
int v5 = 2; // const/4 v5, 0x2
/* .line 7 */
v7 = (( org.json.JSONArray ) v3 ).optInt ( v5 ); // invoke-virtual {v3, v5}, Lorg/json/JSONArray;->optInt(I)I
/* aput v7, v6, v5 */
/* .line 8 */
} // :cond_1
/* new-instance v5, Lorg/json/JSONException; */
final String v6 = "lightSettings don\'t have all three fields"; // const-string v6, "lightSettings don\'t have all three fields"
/* invoke-direct {v5, v6}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v5 */
/* .line 9 */
java.lang.String .valueOf ( v3 );
/* .line 10 */
(( java.lang.IllegalArgumentException ) v5 ).getMessage ( ); // invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;
java.lang.String .valueOf ( v3 );
v6 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* add-int/lit8 v6, v6, 0x3c */
java.lang.String .valueOf ( v5 );
v7 = (( java.lang.String ) v7 ).length ( ); // invoke-virtual {v7}, Ljava/lang/String;->length()I
/* add-int/2addr v6, v7 */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v7 ).append ( v1 ); // invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "."; // const-string v1, "."
(( java.lang.StringBuilder ) v7 ).append ( v1 ); // invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 11 */
android.util.Log .w ( v2,v0 );
/* .line 12 */
/* :catch_1 */
java.lang.String .valueOf ( v3 );
java.lang.String .valueOf ( v3 );
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* add-int/lit8 v5, v5, 0x3a */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,v0 );
} // :goto_0
} // .end method
public android.net.Uri b ( ) {
/* .locals 2 */
final String v0 = "gcm.n.link_android"; // const-string v0, "gcm.n.link_android"
/* .line 6 */
(( e.f.c.u.a0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 7 */
v1 = android.text.TextUtils .isEmpty ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v0 = "gcm.n.link"; // const-string v0, "gcm.n.link"
/* .line 8 */
(( e.f.c.u.a0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 9 */
} // :cond_0
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_1 */
/* .line 10 */
android.net.Uri .parse ( v0 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Integer b ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
(( e.f.c.u.a0 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 2 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 3 */
try { // :try_start_0
v1 = java.lang.Integer .parseInt ( v0 );
java.lang.Integer .valueOf ( v1 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 4 */
/* :catch_0 */
e.f.c.u.a0 .m ( p1 );
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x26 */
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v2 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Couldn\'t parse value of "; // const-string v1, "Couldn\'t parse value of "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "("; // const-string p1, "("
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ") into an int"; // const-string p1, ") into an int"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "NotificationParams"; // const-string v0, "NotificationParams"
/* .line 5 */
android.util.Log .w ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String b ( android.content.res.Resources p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 11 */
(( e.f.c.u.a0 ) p0 ).g ( p3 ); // invoke-virtual {p0, p3}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 12 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 13 */
} // :cond_0
(( e.f.c.u.a0 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/f/c/u/a0;->a(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
final String v0 = "gcm.n.android_channel_id"; // const-string v0, "gcm.n.android_channel_id"
/* .line 6 */
(( e.f.c.u.a0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public org.json.JSONArray c ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
(( e.f.c.u.a0 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 2 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 3 */
try { // :try_start_0
/* new-instance v1, Lorg/json/JSONArray; */
/* invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 4 */
/* :catch_0 */
e.f.c.u.a0 .m ( p1 );
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x32 */
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v2 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Malformed JSON for key "; // const-string v1, "Malformed JSON for key "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": "; // const-string p1, ": "
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ", falling back to default"; // const-string p1, ", falling back to default"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "NotificationParams"; // const-string v0, "NotificationParams"
/* .line 5 */
android.util.Log .w ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.Integer d ( ) {
/* .locals 4 */
final String v0 = "gcm.n.notification_count"; // const-string v0, "gcm.n.notification_count"
/* .line 1 */
(( e.f.c.u.a0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->b(Ljava/lang/String;)Ljava/lang/Integer;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* if-gez v2, :cond_1 */
/* .line 3 */
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x43 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "notificationCount is invalid: "; // const-string v2, "notificationCount is invalid: "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ".Skipping setting notificationCount."; // const-string v0, ".Skipping setting notificationCount."
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "FirebaseMessaging"; // const-string v2, "FirebaseMessaging"
android.util.Log .w ( v2,v0 );
} // :cond_1
} // .end method
public java.lang.Object d ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 4 */
java.lang.String .valueOf ( p1 );
final String v0 = "_loc_args"; // const-string v0, "_loc_args"
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_0
(( java.lang.String ) p1 ).concat ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, v0 */
} // :goto_0
(( e.f.c.u.a0 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/a0;->c(Ljava/lang/String;)Lorg/json/JSONArray;
/* if-nez p1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_1
v0 = (( org.json.JSONArray ) p1 ).length ( ); // invoke-virtual {p1}, Lorg/json/JSONArray;->length()I
/* new-array v1, v0, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-ge v2, v0, :cond_2 */
/* .line 6 */
(( org.json.JSONArray ) p1 ).optString ( v2 ); // invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;
/* aput-object v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public java.lang.Integer e ( ) {
/* .locals 4 */
final String v0 = "gcm.n.notification_priority"; // const-string v0, "gcm.n.notification_priority"
/* .line 1 */
(( e.f.c.u.a0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->b(Ljava/lang/String;)Ljava/lang/Integer;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v3 = -2; // const/4 v3, -0x2
/* if-lt v2, v3, :cond_2 */
/* .line 3 */
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v3 = 2; // const/4 v3, 0x2
/* if-le v2, v3, :cond_1 */
} // :cond_1
/* .line 4 */
} // :cond_2
} // :goto_0
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x48 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "notificationPriority is invalid "; // const-string v2, "notificationPriority is invalid "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ".Skipping setting notificationPriority."; // const-string v0, ".Skipping setting notificationPriority."
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "FirebaseMessaging"; // const-string v2, "FirebaseMessaging"
android.util.Log .w ( v2,v0 );
} // .end method
public java.lang.String e ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 5 */
java.lang.String .valueOf ( p1 );
final String v0 = "_loc_key"; // const-string v0, "_loc_key"
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_0
(( java.lang.String ) p1 ).concat ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, v0 */
} // :goto_0
(( e.f.c.u.a0 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.Long f ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
(( e.f.c.u.a0 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 2 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 3 */
try { // :try_start_0
java.lang.Long .parseLong ( v0 );
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 4 */
/* :catch_0 */
e.f.c.u.a0 .m ( p1 );
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x26 */
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v2 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Couldn\'t parse value of "; // const-string v1, "Couldn\'t parse value of "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "("; // const-string p1, "("
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ") into a long"; // const-string p1, ") into a long"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "NotificationParams"; // const-string v0, "NotificationParams"
/* .line 5 */
android.util.Log .w ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String f ( ) {
/* .locals 2 */
final String v0 = "gcm.n.sound2"; // const-string v0, "gcm.n.sound2"
/* .line 6 */
(( e.f.c.u.a0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 7 */
v1 = android.text.TextUtils .isEmpty ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v0 = "gcm.n.sound"; // const-string v0, "gcm.n.sound"
/* .line 8 */
(( e.f.c.u.a0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
} // .end method
public java.lang.String g ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( e.f.c.u.a0 ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/a0;->h(Ljava/lang/String;)Ljava/lang/String;
(( android.os.Bundle ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public g ( ) {
/* .locals 7 */
final String v0 = "gcm.n.vibrate_timings"; // const-string v0, "gcm.n.vibrate_timings"
/* .line 2 */
(( e.f.c.u.a0 ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->c(Ljava/lang/String;)Lorg/json/JSONArray;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
try { // :try_start_0
v2 = (( org.json.JSONArray ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
int v3 = 1; // const/4 v3, 0x1
/* if-le v2, v3, :cond_2 */
/* .line 4 */
v2 = (( org.json.JSONArray ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
/* new-array v3, v2, [J */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v2, :cond_1 */
/* .line 5 */
(( org.json.JSONArray ) v0 ).optLong ( v4 ); // invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optLong(I)J
/* move-result-wide v5 */
/* aput-wide v5, v3, v4 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
/* .line 6 */
} // :cond_2
/* new-instance v2, Lorg/json/JSONException; */
final String v3 = "vibrateTimings have invalid length"; // const-string v3, "vibrateTimings have invalid length"
/* invoke-direct {v2, v3}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 7 */
/* :catch_0 */
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x4a */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "User defined vibrateTimings is invalid: "; // const-string v2, "User defined vibrateTimings is invalid: "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ".Skipping setting vibrateTimings."; // const-string v0, ".Skipping setting vibrateTimings."
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "NotificationParams"; // const-string v2, "NotificationParams"
android.util.Log .w ( v2,v0 );
} // .end method
public java.lang.Integer h ( ) {
/* .locals 4 */
final String v0 = "gcm.n.visibility"; // const-string v0, "gcm.n.visibility"
/* .line 1 */
(( e.f.c.u.a0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->b(Ljava/lang/String;)Ljava/lang/Integer;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v3 = -1; // const/4 v3, -0x1
/* if-lt v2, v3, :cond_2 */
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v3 = 1; // const/4 v3, 0x1
/* if-le v2, v3, :cond_1 */
} // :cond_1
/* .line 3 */
} // :cond_2
} // :goto_0
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x35 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "visibility is invalid: "; // const-string v2, "visibility is invalid: "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ".Skipping setting visibility."; // const-string v0, ".Skipping setting visibility."
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "NotificationParams"; // const-string v2, "NotificationParams"
android.util.Log .w ( v2,v0 );
} // .end method
public final java.lang.String h ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.a;
v0 = (( android.os.Bundle ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = "gcm.n."; // const-string v0, "gcm.n."
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
e.f.c.u.a0 .l ( p1 );
/* .line 6 */
v1 = this.a;
v1 = (( android.os.Bundle ) v1 ).containsKey ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
} // .end method
public android.os.Bundle i ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Landroid/os/Bundle; */
v1 = this.a;
/* invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
/* .line 2 */
v1 = this.a;
(( android.os.Bundle ) v1 ).keySet ( ); // invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/lang/String; */
/* .line 3 */
v3 = e.f.c.u.a0 .j ( v2 );
/* if-nez v3, :cond_0 */
/* .line 4 */
(( android.os.Bundle ) v0 ).remove ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
} // :cond_1
} // .end method
public android.os.Bundle j ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Landroid/os/Bundle; */
v1 = this.a;
/* invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
/* .line 2 */
v1 = this.a;
(( android.os.Bundle ) v1 ).keySet ( ); // invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/lang/String; */
/* .line 3 */
v3 = e.f.c.u.a0 .k ( v2 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 4 */
(( android.os.Bundle ) v0 ).remove ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
} // :cond_1
} // .end method
