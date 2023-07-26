public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/bumptech/glide/load/ImageHeaderParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "ImageType" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType $VALUES; //synthetic
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType ANIMATED_AVIF;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType ANIMATED_WEBP;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType AVIF;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType GIF;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType JPEG;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType PNG;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType PNG_A;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType RAW;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType UNKNOWN;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType WEBP;
public static final com.bumptech.glide.load.ImageHeaderParser$ImageType WEBP_A;
/* # instance fields */
public final Boolean b;
/* # direct methods */
public static inal ( ) {
/* .locals 14 */
/* .line 1 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
final String v3 = "GIF"; // const-string v3, "GIF"
/* invoke-direct {v0, v3, v1, v2}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 2 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
final String v3 = "JPEG"; // const-string v3, "JPEG"
/* invoke-direct {v0, v3, v2, v1}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 3 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
int v3 = 2; // const/4 v3, 0x2
final String v4 = "RAW"; // const-string v4, "RAW"
/* invoke-direct {v0, v4, v3, v1}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 4 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
int v4 = 3; // const/4 v4, 0x3
final String v5 = "PNG_A"; // const-string v5, "PNG_A"
/* invoke-direct {v0, v5, v4, v2}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 5 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
int v5 = 4; // const/4 v5, 0x4
final String v6 = "PNG"; // const-string v6, "PNG"
/* invoke-direct {v0, v6, v5, v1}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 6 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
int v6 = 5; // const/4 v6, 0x5
final String v7 = "WEBP_A"; // const-string v7, "WEBP_A"
/* invoke-direct {v0, v7, v6, v2}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 7 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
int v7 = 6; // const/4 v7, 0x6
final String v8 = "WEBP"; // const-string v8, "WEBP"
/* invoke-direct {v0, v8, v7, v1}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 8 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
int v8 = 7; // const/4 v8, 0x7
final String v9 = "ANIMATED_WEBP"; // const-string v9, "ANIMATED_WEBP"
/* invoke-direct {v0, v9, v8, v2}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 9 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
/* const/16 v9, 0x8 */
final String v10 = "AVIF"; // const-string v10, "AVIF"
/* invoke-direct {v0, v10, v9, v2}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 10 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
/* const/16 v10, 0x9 */
final String v11 = "ANIMATED_AVIF"; // const-string v11, "ANIMATED_AVIF"
/* invoke-direct {v0, v11, v10, v2}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* .line 11 */
/* new-instance v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
/* const/16 v11, 0xa */
final String v12 = "UNKNOWN"; // const-string v12, "UNKNOWN"
/* invoke-direct {v0, v12, v11, v1}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;-><init>(Ljava/lang/String;IZ)V */
/* const/16 v12, 0xb */
/* new-array v12, v12, [Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
/* .line 12 */
v13 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
/* aput-object v13, v12, v1 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG;
/* aput-object v1, v12, v2 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.RAW;
/* aput-object v1, v12, v3 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A;
/* aput-object v1, v12, v4 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
/* aput-object v1, v12, v5 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A;
/* aput-object v1, v12, v6 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP;
/* aput-object v1, v12, v7 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP;
/* aput-object v1, v12, v8 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.AVIF;
/* aput-object v1, v12, v9 */
v1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF;
/* aput-object v1, v12, v10 */
/* aput-object v0, v12, v11 */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(Z)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 2 */
/* iput-boolean p3, p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->b:Z */
return;
} // .end method
public static com.bumptech.glide.load.ImageHeaderParser$ImageType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
} // .end method
public static com.bumptech.glide.load.ImageHeaderParser$ImageType values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.$VALUES;
(( com.bumptech.glide.load.ImageHeaderParser$ImageType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/bumptech/glide/load/ImageHeaderParser$ImageType; */
} // .end method
/* # virtual methods */
public Boolean hasAlpha ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->b:Z */
} // .end method
public Boolean isWebp ( ) {
/* .locals 3 */
/* .line 1 */
v0 = com.bumptech.glide.load.ImageHeaderParser$a.a;
v1 = (( java.lang.Enum ) p0 ).ordinal ( ); // invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_0 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq v0, v2, :cond_0 */
int v2 = 3; // const/4 v2, 0x3
/* if-eq v0, v2, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
} // .end method
