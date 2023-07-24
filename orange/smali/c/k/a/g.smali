.class public Lc/k/a/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:[B

.field public static final B:[B

.field public static final C:[B

.field public static final D:[B

.field public static E:Ljava/text/SimpleDateFormat;

.field public static F:Ljava/text/SimpleDateFormat;

.field public static final G:[Ljava/lang/String;

.field public static final H:[I

.field public static final I:[B

.field public static final J:[Lc/k/a/d;

.field public static final K:[Lc/k/a/d;

.field public static final L:[Lc/k/a/d;

.field public static final M:[Lc/k/a/d;

.field public static final N:[Lc/k/a/d;

.field public static final O:Lc/k/a/d;

.field public static final P:[Lc/k/a/d;

.field public static final Q:[Lc/k/a/d;

.field public static final R:[Lc/k/a/d;

.field public static final S:[Lc/k/a/d;

.field public static final T:[[Lc/k/a/d;

.field public static final U:[Lc/k/a/d;

.field public static final V:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lc/k/a/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final W:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc/k/a/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final X:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final Y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final Z:Ljava/nio/charset/Charset;

.field public static final a0:[B

.field public static final b0:[B

.field public static final o:Z

.field public static final p:[I

.field public static final q:[I

.field public static final r:[B

.field public static final s:[B

.field public static final t:[B

.field public static final u:[B

.field public static final v:[B

.field public static final w:[B

.field public static final x:[B

.field public static final y:[B

.field public static final z:[B


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/io/FileDescriptor;

.field public c:Landroid/content/res/AssetManager$AssetInputStream;

.field public d:I

.field public e:Z

.field public final f:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc/k/a/c;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/nio/ByteOrder;

.field public i:Z

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I


# direct methods
.method public static constructor <clinit>()V
    .locals 30

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ExifInterface"

    .line 2
    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    sput-boolean v2, Lc/k/a/g;->o:Z

    const/4 v2, 0x4

    new-array v3, v2, [Ljava/lang/Integer;

    const/4 v4, 0x1

    .line 3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v3, v6

    const/4 v7, 0x6

    .line 4
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v3, v4

    const/4 v8, 0x2

    .line 5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v1, v3, v8

    const/16 v10, 0x8

    .line 6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v3, v0

    .line 7
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    new-array v3, v2, [Ljava/lang/Integer;

    aput-object v9, v3, v6

    const/4 v12, 0x7

    .line 8
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v3, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v3, v8

    const/4 v14, 0x5

    .line 9
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v3, v0

    .line 10
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    new-array v3, v0, [I

    .line 11
    fill-array-data v3, :array_0

    sput-object v3, Lc/k/a/g;->p:[I

    new-array v3, v4, [I

    aput v10, v3, v6

    .line 12
    sput-object v3, Lc/k/a/g;->q:[I

    new-array v3, v0, [B

    .line 13
    fill-array-data v3, :array_1

    sput-object v3, Lc/k/a/g;->r:[B

    new-array v3, v2, [B

    .line 14
    fill-array-data v3, :array_2

    sput-object v3, Lc/k/a/g;->s:[B

    new-array v3, v2, [B

    .line 15
    fill-array-data v3, :array_3

    sput-object v3, Lc/k/a/g;->t:[B

    new-array v3, v2, [B

    .line 16
    fill-array-data v3, :array_4

    sput-object v3, Lc/k/a/g;->u:[B

    new-array v3, v7, [B

    .line 17
    fill-array-data v3, :array_5

    sput-object v3, Lc/k/a/g;->v:[B

    const/16 v3, 0xa

    new-array v12, v3, [B

    .line 18
    fill-array-data v12, :array_6

    sput-object v12, Lc/k/a/g;->w:[B

    new-array v12, v10, [B

    .line 19
    fill-array-data v12, :array_7

    sput-object v12, Lc/k/a/g;->x:[B

    new-array v12, v2, [B

    .line 20
    fill-array-data v12, :array_8

    sput-object v12, Lc/k/a/g;->y:[B

    new-array v12, v2, [B

    .line 21
    fill-array-data v12, :array_9

    sput-object v12, Lc/k/a/g;->z:[B

    new-array v12, v2, [B

    .line 22
    fill-array-data v12, :array_a

    sput-object v12, Lc/k/a/g;->A:[B

    new-array v12, v2, [B

    .line 23
    fill-array-data v12, :array_b

    sput-object v12, Lc/k/a/g;->B:[B

    new-array v12, v2, [B

    .line 24
    fill-array-data v12, :array_c

    sput-object v12, Lc/k/a/g;->C:[B

    new-array v12, v2, [B

    .line 25
    fill-array-data v12, :array_d

    sput-object v12, Lc/k/a/g;->D:[B

    .line 26
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v12

    const-string v3, "VP8X"

    invoke-virtual {v3, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 27
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    const-string v12, "VP8L"

    invoke-virtual {v12, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 28
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    const-string v12, "VP8 "

    invoke-virtual {v12, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 29
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    const-string v12, "ANIM"

    invoke-virtual {v12, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 30
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    const-string v12, "ANMF"

    invoke-virtual {v12, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v16, ""

    const-string v17, "BYTE"

    const-string v18, "STRING"

    const-string v19, "USHORT"

    const-string v20, "ULONG"

    const-string v21, "URATIONAL"

    const-string v22, "SBYTE"

    const-string v23, "UNDEFINED"

    const-string v24, "SSHORT"

    const-string v25, "SLONG"

    const-string v26, "SRATIONAL"

    const-string v27, "SINGLE"

    const-string v28, "DOUBLE"

    const-string v29, "IFD"

    .line 31
    filled-new-array/range {v16 .. v29}, [Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lc/k/a/g;->G:[Ljava/lang/String;

    const/16 v3, 0xe

    new-array v12, v3, [I

    .line 32
    fill-array-data v12, :array_e

    sput-object v12, Lc/k/a/g;->H:[I

    new-array v12, v10, [B

    .line 33
    fill-array-data v12, :array_f

    sput-object v12, Lc/k/a/g;->I:[B

    const/16 v12, 0x2a

    new-array v12, v12, [Lc/k/a/d;

    .line 34
    new-instance v3, Lc/k/a/d;

    const-string v10, "NewSubfileType"

    const/16 v7, 0xfe

    invoke-direct {v3, v10, v7, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v7, "SubfileType"

    const/16 v10, 0xff

    invoke-direct {v3, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v3, v12, v4

    new-instance v3, Lc/k/a/d;

    const-string v7, "ImageWidth"

    const/16 v10, 0x100

    invoke-direct {v3, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    aput-object v3, v12, v8

    new-instance v3, Lc/k/a/d;

    const-string v7, "ImageLength"

    const/16 v10, 0x101

    invoke-direct {v3, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    aput-object v3, v12, v0

    new-instance v3, Lc/k/a/d;

    const-string v7, "BitsPerSample"

    const/16 v10, 0x102

    invoke-direct {v3, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v3, v12, v2

    new-instance v3, Lc/k/a/d;

    const-string v7, "Compression"

    const/16 v10, 0x103

    invoke-direct {v3, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v3, v12, v14

    new-instance v3, Lc/k/a/d;

    const-string v7, "PhotometricInterpretation"

    const/16 v10, 0x106

    invoke-direct {v3, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x6

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v7, "ImageDescription"

    const/16 v10, 0x10e

    invoke-direct {v3, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x7

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v7, "Make"

    const/16 v10, 0x10f

    invoke-direct {v3, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x8

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v7, "Model"

    const/16 v10, 0x110

    invoke-direct {v3, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x9

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "StripOffsets"

    const/16 v7, 0x111

    invoke-direct {v3, v10, v7, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0xa

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v7, "Orientation"

    const/16 v10, 0x112

    invoke-direct {v3, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xb

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "SamplesPerPixel"

    const/16 v7, 0x115

    invoke-direct {v3, v10, v7, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xc

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "RowsPerStrip"

    const/16 v7, 0x116

    invoke-direct {v3, v10, v7, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0xd

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "StripByteCounts"

    const/16 v7, 0x117

    invoke-direct {v3, v10, v7, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0xe

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v7, "XResolution"

    const/16 v10, 0x11a

    invoke-direct {v3, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xf

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "YResolution"

    const/16 v7, 0x11b

    invoke-direct {v3, v10, v7, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x10

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "PlanarConfiguration"

    const/16 v7, 0x11c

    invoke-direct {v3, v10, v7, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x11

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "ResolutionUnit"

    const/16 v7, 0x128

    invoke-direct {v3, v10, v7, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x12

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "TransferFunction"

    const/16 v7, 0x12d

    invoke-direct {v3, v10, v7, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x13

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "Software"

    const/16 v7, 0x131

    invoke-direct {v3, v10, v7, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x14

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "DateTime"

    const/16 v7, 0x132

    invoke-direct {v3, v10, v7, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x15

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v7, "Artist"

    const/16 v10, 0x13b

    invoke-direct {v3, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x16

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v7, "WhitePoint"

    const/16 v10, 0x13e

    invoke-direct {v3, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x17

    aput-object v3, v12, v7

    new-instance v3, Lc/k/a/d;

    const-string v10, "PrimaryChromaticities"

    const/16 v6, 0x13f

    invoke-direct {v3, v10, v6, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x18

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "SubIFDPointer"

    const/16 v10, 0x14a

    invoke-direct {v3, v6, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x19

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "JPEGInterchangeFormat"

    const/16 v10, 0x201

    invoke-direct {v3, v6, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x1a

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "JPEGInterchangeFormatLength"

    const/16 v10, 0x202

    invoke-direct {v3, v6, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x1b

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "YCbCrCoefficients"

    const/16 v10, 0x211

    invoke-direct {v3, v6, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x1c

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "YCbCrSubSampling"

    const/16 v10, 0x212

    invoke-direct {v3, v6, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x1d

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "YCbCrPositioning"

    const/16 v10, 0x213

    invoke-direct {v3, v6, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x1e

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "ReferenceBlackWhite"

    const/16 v10, 0x214

    invoke-direct {v3, v6, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x1f

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "Copyright"

    const v10, 0x8298

    invoke-direct {v3, v6, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x20

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "ExifIFDPointer"

    const v10, 0x8769

    invoke-direct {v3, v6, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x21

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "GPSInfoIFDPointer"

    const v10, 0x8825

    invoke-direct {v3, v6, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x22

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "SensorTopBorder"

    invoke-direct {v3, v6, v2, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x23

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "SensorLeftBorder"

    invoke-direct {v3, v6, v14, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x24

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "SensorBottomBorder"

    const/4 v10, 0x6

    invoke-direct {v3, v6, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x25

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "SensorRightBorder"

    const/4 v10, 0x7

    invoke-direct {v3, v6, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x26

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "ISO"

    invoke-direct {v3, v6, v7, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x27

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "JpgFromRaw"

    const/16 v7, 0x2e

    invoke-direct {v3, v6, v7, v10}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x28

    aput-object v3, v12, v6

    new-instance v3, Lc/k/a/d;

    const-string v6, "Xmp"

    const/16 v7, 0x2bc

    invoke-direct {v3, v6, v7, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v6, 0x29

    aput-object v3, v12, v6

    sput-object v12, Lc/k/a/g;->J:[Lc/k/a/d;

    const/16 v3, 0x4a

    new-array v3, v3, [Lc/k/a/d;

    .line 35
    new-instance v6, Lc/k/a/d;

    const-string v7, "ExposureTime"

    const v10, 0x829a

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x0

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FNumber"

    const v10, 0x829d

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v4

    new-instance v6, Lc/k/a/d;

    const-string v7, "ExposureProgram"

    const v10, 0x8822

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v8

    new-instance v6, Lc/k/a/d;

    const-string v7, "SpectralSensitivity"

    const v10, 0x8824

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v0

    new-instance v6, Lc/k/a/d;

    const-string v7, "PhotographicSensitivity"

    const v10, 0x8827

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v2

    new-instance v6, Lc/k/a/d;

    const-string v7, "OECF"

    const v10, 0x8828

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v14

    new-instance v6, Lc/k/a/d;

    const-string v7, "SensitivityType"

    const v10, 0x8830

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x6

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "StandardOutputSensitivity"

    const v10, 0x8831

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v12

    new-instance v6, Lc/k/a/d;

    const-string v7, "RecommendedExposureIndex"

    const v10, 0x8832

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x8

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ISOSpeed"

    const v10, 0x8833

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x9

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ISOSpeedLatitudeyyy"

    const v10, 0x8834

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xa

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ISOSpeedLatitudezzz"

    const v10, 0x8835

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xb

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ExifVersion"

    const v10, 0x9000

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xc

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DateTimeOriginal"

    const v10, 0x9003

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xd

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DateTimeDigitized"

    const v10, 0x9004

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xe

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "OffsetTime"

    const v10, 0x9010

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xf

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "OffsetTimeOriginal"

    const v10, 0x9011

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x10

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "OffsetTimeDigitized"

    const v10, 0x9012

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x11

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ComponentsConfiguration"

    const v10, 0x9101

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x12

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "CompressedBitsPerPixel"

    const v10, 0x9102

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x13

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ShutterSpeedValue"

    const v10, 0x9201

    const/16 v12, 0xa

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x14

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ApertureValue"

    const v10, 0x9202

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x15

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "BrightnessValue"

    const v10, 0x9203

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x16

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ExposureBiasValue"

    const v10, 0x9204

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x17

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "MaxApertureValue"

    const v10, 0x9205

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x18

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubjectDistance"

    const v10, 0x9206

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x19

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "MeteringMode"

    const v10, 0x9207

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1a

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "LightSource"

    const v10, 0x9208

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1b

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Flash"

    const v10, 0x9209

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1c

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FocalLength"

    const v10, 0x920a

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1d

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubjectArea"

    const v10, 0x9214

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1e

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "MakerNote"

    const v10, 0x927c

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1f

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "UserComment"

    const v10, 0x9286

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x20

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubSecTime"

    const v10, 0x9290

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x21

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubSecTimeOriginal"

    const v10, 0x9291

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x22

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubSecTimeDigitized"

    const v10, 0x9292

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x23

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FlashpixVersion"

    const v10, 0xa000

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x24

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ColorSpace"

    const v10, 0xa001

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x25

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "PixelXDimension"

    const v10, 0xa002

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0x26

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "PixelYDimension"

    const v10, 0xa003

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0x27

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "RelatedSoundFile"

    const v10, 0xa004

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x28

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "InteroperabilityIFDPointer"

    const v10, 0xa005

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x29

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FlashEnergy"

    const v10, 0xa20b

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x2a

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SpatialFrequencyResponse"

    const v10, 0xa20c

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x2b

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FocalPlaneXResolution"

    const v10, 0xa20e

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x2c

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FocalPlaneYResolution"

    const v10, 0xa20f

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x2d

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FocalPlaneResolutionUnit"

    const v10, 0xa210

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x2e

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubjectLocation"

    const v10, 0xa214

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x2f

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ExposureIndex"

    const v10, 0xa215

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x30

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SensingMethod"

    const v10, 0xa217

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x31

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FileSource"

    const v10, 0xa300

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x32

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SceneType"

    const v10, 0xa301

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x33

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "CFAPattern"

    const v10, 0xa302

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x34

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "CustomRendered"

    const v10, 0xa401

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x35

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ExposureMode"

    const v10, 0xa402

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x36

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "WhiteBalance"

    const v10, 0xa403

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x37

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DigitalZoomRatio"

    const v10, 0xa404

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x38

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "FocalLengthIn35mmFilm"

    const v10, 0xa405

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x39

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SceneCaptureType"

    const v10, 0xa406

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x3a

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GainControl"

    const v10, 0xa407

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x3b

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Contrast"

    const v10, 0xa408

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x3c

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Saturation"

    const v10, 0xa409

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x3d

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Sharpness"

    const v10, 0xa40a

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x3e

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DeviceSettingDescription"

    const v10, 0xa40b

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x3f

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubjectDistanceRange"

    const v10, 0xa40c

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x40

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ImageUniqueID"

    const v10, 0xa420

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x41

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "CameraOwnerName"

    const v10, 0xa430

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x42

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "BodySerialNumber"

    const v10, 0xa431

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x43

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "LensSpecification"

    const v10, 0xa432

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x44

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "LensMake"

    const v10, 0xa433

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x45

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "LensModel"

    const v10, 0xa434

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x46

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Gamma"

    const v10, 0xa500

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x47

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DNGVersion"

    const v10, 0xc612

    invoke-direct {v6, v7, v10, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x48

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DefaultCropSize"

    const v10, 0xc620

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0x49

    aput-object v6, v3, v7

    sput-object v3, Lc/k/a/g;->K:[Lc/k/a/d;

    const/16 v3, 0x20

    new-array v3, v3, [Lc/k/a/d;

    .line 36
    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSVersionID"

    const/4 v10, 0x0

    invoke-direct {v6, v7, v10, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSLatitudeRef"

    invoke-direct {v6, v7, v4, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v4

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSLatitude"

    const/16 v10, 0xa

    invoke-direct {v6, v7, v8, v14, v10}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    aput-object v6, v3, v8

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSLongitudeRef"

    invoke-direct {v6, v7, v0, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v0

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSLongitude"

    invoke-direct {v6, v7, v2, v14, v10}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    aput-object v6, v3, v2

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSAltitudeRef"

    invoke-direct {v6, v7, v14, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v14

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSAltitude"

    const/4 v10, 0x6

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSTimeStamp"

    const/4 v10, 0x7

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSSatellites"

    const/16 v10, 0x8

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSStatus"

    const/16 v10, 0x9

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSMeasureMode"

    const/16 v10, 0xa

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDOP"

    const/16 v10, 0xb

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSSpeedRef"

    const/16 v10, 0xc

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSSpeed"

    const/16 v10, 0xd

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSTrackRef"

    const/16 v10, 0xe

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSTrack"

    const/16 v10, 0xf

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSImgDirectionRef"

    const/16 v10, 0x10

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSImgDirection"

    const/16 v10, 0x11

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSMapDatum"

    const/16 v10, 0x12

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestLatitudeRef"

    const/16 v10, 0x13

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestLatitude"

    const/16 v10, 0x14

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestLongitudeRef"

    const/16 v10, 0x15

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x15

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestLongitude"

    const/16 v10, 0x16

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x16

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestBearingRef"

    const/16 v10, 0x17

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v10

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestBearing"

    const/16 v10, 0x18

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x18

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestDistanceRef"

    const/16 v10, 0x19

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x19

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDestDistance"

    const/16 v10, 0x1a

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1a

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSProcessingMethod"

    const/16 v10, 0x1b

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1b

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSAreaInformation"

    const/16 v10, 0x1c

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1c

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDateStamp"

    const/16 v10, 0x1d

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1d

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSDifferential"

    const/16 v10, 0x1e

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1e

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSHPositioningError"

    const/16 v10, 0x1f

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1f

    aput-object v6, v3, v7

    sput-object v3, Lc/k/a/g;->L:[Lc/k/a/d;

    new-array v3, v4, [Lc/k/a/d;

    .line 37
    new-instance v6, Lc/k/a/d;

    const-string v7, "InteroperabilityIndex"

    invoke-direct {v6, v7, v4, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x0

    aput-object v6, v3, v7

    sput-object v3, Lc/k/a/g;->M:[Lc/k/a/d;

    const/16 v3, 0x26

    new-array v3, v3, [Lc/k/a/d;

    .line 38
    new-instance v6, Lc/k/a/d;

    const-string v10, "NewSubfileType"

    const/16 v12, 0xfe

    invoke-direct {v6, v10, v12, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubfileType"

    const/16 v10, 0xff

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v4

    new-instance v6, Lc/k/a/d;

    const-string v7, "ThumbnailImageWidth"

    const/16 v10, 0x100

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    aput-object v6, v3, v8

    new-instance v6, Lc/k/a/d;

    const-string v7, "ThumbnailImageLength"

    const/16 v10, 0x101

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    aput-object v6, v3, v0

    new-instance v6, Lc/k/a/d;

    const-string v7, "BitsPerSample"

    const/16 v10, 0x102

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v2

    new-instance v6, Lc/k/a/d;

    const-string v7, "Compression"

    const/16 v10, 0x103

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v14

    new-instance v6, Lc/k/a/d;

    const-string v7, "PhotometricInterpretation"

    const/16 v10, 0x106

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x6

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ImageDescription"

    const/16 v10, 0x10e

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x7

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Make"

    const/16 v10, 0x10f

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x8

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Model"

    const/16 v10, 0x110

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x9

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "StripOffsets"

    const/16 v10, 0x111

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0xa

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ThumbnailOrientation"

    const/16 v10, 0x112

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xb

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SamplesPerPixel"

    const/16 v10, 0x115

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xc

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "RowsPerStrip"

    const/16 v10, 0x116

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0xd

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "StripByteCounts"

    const/16 v10, 0x117

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0xe

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "XResolution"

    const/16 v10, 0x11a

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0xf

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "YResolution"

    const/16 v10, 0x11b

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x10

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "PlanarConfiguration"

    const/16 v10, 0x11c

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x11

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ResolutionUnit"

    const/16 v10, 0x128

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x12

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "TransferFunction"

    const/16 v10, 0x12d

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x13

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Software"

    const/16 v10, 0x131

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x14

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DateTime"

    const/16 v10, 0x132

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x15

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Artist"

    const/16 v10, 0x13b

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x16

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "WhitePoint"

    const/16 v10, 0x13e

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x17

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "PrimaryChromaticities"

    const/16 v10, 0x13f

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x18

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "SubIFDPointer"

    const/16 v10, 0x14a

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x19

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "JPEGInterchangeFormat"

    const/16 v10, 0x201

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1a

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "JPEGInterchangeFormatLength"

    const/16 v10, 0x202

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1b

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "YCbCrCoefficients"

    const/16 v10, 0x211

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1c

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "YCbCrSubSampling"

    const/16 v10, 0x212

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1d

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "YCbCrPositioning"

    const/16 v10, 0x213

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1e

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ReferenceBlackWhite"

    const/16 v10, 0x214

    invoke-direct {v6, v7, v10, v14}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x1f

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Xmp"

    const/16 v10, 0x2bc

    invoke-direct {v6, v7, v10, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x20

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "Copyright"

    const v10, 0x8298

    invoke-direct {v6, v7, v10, v8}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x21

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ExifIFDPointer"

    const v10, 0x8769

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x22

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSInfoIFDPointer"

    const v10, 0x8825

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x23

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DNGVersion"

    const v10, 0xc612

    invoke-direct {v6, v7, v10, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/16 v7, 0x24

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "DefaultCropSize"

    const v10, 0xc620

    invoke-direct {v6, v7, v10, v0, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;III)V

    const/16 v7, 0x25

    aput-object v6, v3, v7

    sput-object v3, Lc/k/a/g;->N:[Lc/k/a/d;

    .line 39
    new-instance v3, Lc/k/a/d;

    const-string v6, "StripOffsets"

    const/16 v7, 0x111

    invoke-direct {v3, v6, v7, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lc/k/a/g;->O:Lc/k/a/d;

    new-array v3, v0, [Lc/k/a/d;

    .line 40
    new-instance v6, Lc/k/a/d;

    const-string v7, "ThumbnailImage"

    const/16 v10, 0x100

    const/4 v12, 0x7

    invoke-direct {v6, v7, v10, v12}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x0

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "CameraSettingsIFDPointer"

    const/16 v10, 0x2020

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v4

    new-instance v6, Lc/k/a/d;

    const-string v7, "ImageProcessingIFDPointer"

    const/16 v10, 0x2040

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v8

    sput-object v3, Lc/k/a/g;->P:[Lc/k/a/d;

    new-array v3, v8, [Lc/k/a/d;

    .line 41
    new-instance v6, Lc/k/a/d;

    const-string v7, "PreviewImageStart"

    const/16 v10, 0x101

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x0

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "PreviewImageLength"

    const/16 v10, 0x102

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v4

    sput-object v3, Lc/k/a/g;->Q:[Lc/k/a/d;

    new-array v3, v4, [Lc/k/a/d;

    .line 42
    new-instance v6, Lc/k/a/d;

    const-string v7, "AspectFrame"

    const/16 v10, 0x1113

    invoke-direct {v6, v7, v10, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x0

    aput-object v6, v3, v7

    sput-object v3, Lc/k/a/g;->R:[Lc/k/a/d;

    new-array v3, v4, [Lc/k/a/d;

    .line 43
    new-instance v6, Lc/k/a/d;

    const-string v10, "ColorSpace"

    const/16 v12, 0x37

    invoke-direct {v6, v10, v12, v0}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v7

    sput-object v3, Lc/k/a/g;->S:[Lc/k/a/d;

    const/16 v6, 0xa

    new-array v6, v6, [[Lc/k/a/d;

    .line 44
    sget-object v10, Lc/k/a/g;->J:[Lc/k/a/d;

    aput-object v10, v6, v7

    sget-object v7, Lc/k/a/g;->K:[Lc/k/a/d;

    aput-object v7, v6, v4

    sget-object v7, Lc/k/a/g;->L:[Lc/k/a/d;

    aput-object v7, v6, v8

    sget-object v7, Lc/k/a/g;->M:[Lc/k/a/d;

    aput-object v7, v6, v0

    sget-object v7, Lc/k/a/g;->N:[Lc/k/a/d;

    aput-object v7, v6, v2

    aput-object v10, v6, v14

    sget-object v7, Lc/k/a/g;->P:[Lc/k/a/d;

    const/4 v10, 0x6

    aput-object v7, v6, v10

    sget-object v7, Lc/k/a/g;->Q:[Lc/k/a/d;

    const/4 v12, 0x7

    aput-object v7, v6, v12

    sget-object v7, Lc/k/a/g;->R:[Lc/k/a/d;

    const/16 v12, 0x8

    aput-object v7, v6, v12

    const/16 v7, 0x9

    aput-object v3, v6, v7

    sput-object v6, Lc/k/a/g;->T:[[Lc/k/a/d;

    new-array v3, v10, [Lc/k/a/d;

    .line 45
    new-instance v6, Lc/k/a/d;

    const-string v7, "SubIFDPointer"

    const/16 v10, 0x14a

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    const/4 v7, 0x0

    aput-object v6, v3, v7

    new-instance v6, Lc/k/a/d;

    const-string v7, "ExifIFDPointer"

    const v10, 0x8769

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v4

    new-instance v6, Lc/k/a/d;

    const-string v7, "GPSInfoIFDPointer"

    const v10, 0x8825

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v8

    new-instance v6, Lc/k/a/d;

    const-string v7, "InteroperabilityIFDPointer"

    const v10, 0xa005

    invoke-direct {v6, v7, v10, v2}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v0

    new-instance v6, Lc/k/a/d;

    const-string v7, "CameraSettingsIFDPointer"

    const/16 v10, 0x2020

    invoke-direct {v6, v7, v10, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v2

    new-instance v6, Lc/k/a/d;

    const-string v7, "ImageProcessingIFDPointer"

    const/16 v10, 0x2040

    invoke-direct {v6, v7, v10, v4}, Lc/k/a/d;-><init>(Ljava/lang/String;II)V

    aput-object v6, v3, v14

    sput-object v3, Lc/k/a/g;->U:[Lc/k/a/d;

    .line 46
    sget-object v3, Lc/k/a/g;->T:[[Lc/k/a/d;

    array-length v6, v3

    new-array v6, v6, [Ljava/util/HashMap;

    sput-object v6, Lc/k/a/g;->V:[Ljava/util/HashMap;

    .line 47
    array-length v3, v3

    new-array v3, v3, [Ljava/util/HashMap;

    sput-object v3, Lc/k/a/g;->W:[Ljava/util/HashMap;

    .line 48
    new-instance v3, Ljava/util/HashSet;

    const-string v6, "FNumber"

    const-string v7, "DigitalZoomRatio"

    const-string v10, "ExposureTime"

    const-string v12, "SubjectDistance"

    const-string v14, "GPSTimeStamp"

    filled-new-array {v6, v7, v10, v12, v14}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v3, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v3, Lc/k/a/g;->X:Ljava/util/HashSet;

    .line 49
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lc/k/a/g;->Y:Ljava/util/HashMap;

    const-string v3, "US-ASCII"

    .line 50
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    sput-object v3, Lc/k/a/g;->Z:Ljava/nio/charset/Charset;

    const-string v6, "Exif\u0000\u0000"

    .line 51
    invoke-virtual {v6, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    sput-object v3, Lc/k/a/g;->a0:[B

    .line 52
    sget-object v3, Lc/k/a/g;->Z:Ljava/nio/charset/Charset;

    const-string v6, "http://ns.adobe.com/xap/1.0/\u0000"

    .line 53
    invoke-virtual {v6, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    sput-object v3, Lc/k/a/g;->b0:[B

    .line 54
    new-instance v3, Ljava/text/SimpleDateFormat;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v3, v7, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v3, Lc/k/a/g;->E:Ljava/text/SimpleDateFormat;

    const-string v6, "UTC"

    .line 55
    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 56
    new-instance v3, Ljava/text/SimpleDateFormat;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v3, v7, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v3, Lc/k/a/g;->F:Ljava/text/SimpleDateFormat;

    const-string v6, "UTC"

    .line 57
    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v7, 0x0

    .line 58
    :goto_0
    sget-object v3, Lc/k/a/g;->T:[[Lc/k/a/d;

    array-length v3, v3

    if-ge v7, v3, :cond_1

    .line 59
    sget-object v3, Lc/k/a/g;->V:[Ljava/util/HashMap;

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    aput-object v6, v3, v7

    .line 60
    sget-object v3, Lc/k/a/g;->W:[Ljava/util/HashMap;

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    aput-object v6, v3, v7

    .line 61
    sget-object v3, Lc/k/a/g;->T:[[Lc/k/a/d;

    aget-object v3, v3, v7

    array-length v6, v3

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v6, :cond_0

    aget-object v12, v3, v10

    .line 62
    sget-object v14, Lc/k/a/g;->V:[Ljava/util/HashMap;

    aget-object v14, v14, v7

    iget v2, v12, Lc/k/a/d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v14, v2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v2, Lc/k/a/g;->W:[Ljava/util/HashMap;

    aget-object v2, v2, v7

    iget-object v14, v12, Lc/k/a/d;->b:Ljava/lang/String;

    invoke-virtual {v2, v14, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x4

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    const/4 v2, 0x4

    goto :goto_0

    .line 64
    :cond_1
    sget-object v2, Lc/k/a/g;->Y:Ljava/util/HashMap;

    sget-object v3, Lc/k/a/g;->U:[Lc/k/a/d;

    const/4 v6, 0x0

    aget-object v3, v3, v6

    iget v3, v3, Lc/k/a/d;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v2, Lc/k/a/g;->Y:Ljava/util/HashMap;

    sget-object v3, Lc/k/a/g;->U:[Lc/k/a/d;

    aget-object v3, v3, v4

    iget v3, v3, Lc/k/a/d;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v2, Lc/k/a/g;->Y:Ljava/util/HashMap;

    sget-object v3, Lc/k/a/g;->U:[Lc/k/a/d;

    aget-object v3, v3, v8

    iget v3, v3, Lc/k/a/d;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v2, Lc/k/a/g;->Y:Ljava/util/HashMap;

    sget-object v3, Lc/k/a/g;->U:[Lc/k/a/d;

    aget-object v0, v3, v0

    iget v0, v0, Lc/k/a/d;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lc/k/a/g;->Y:Ljava/util/HashMap;

    sget-object v1, Lc/k/a/g;->U:[Lc/k/a/d;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    iget v1, v1, Lc/k/a/d;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lc/k/a/g;->Y:Ljava/util/HashMap;

    sget-object v1, Lc/k/a/g;->U:[Lc/k/a/d;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    iget v1, v1, Lc/k/a/d;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, ".*[1-9].*"

    .line 70
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 71
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 72
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 73
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void

    :array_0
    .array-data 4
        0x8
        0x8
        0x8
    .end array-data

    :array_1
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    :array_2
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    :array_3
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    :array_4
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    :array_5
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    nop

    :array_7
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_8
    .array-data 1
        0x65t
        0x58t
        0x49t
        0x66t
    .end array-data

    :array_9
    .array-data 1
        0x49t
        0x48t
        0x44t
        0x52t
    .end array-data

    :array_a
    .array-data 1
        0x49t
        0x45t
        0x4et
        0x44t
    .end array-data

    :array_b
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_c
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_d
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_e
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_f
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lc/k/a/g;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lc/k/a/g;->T:[[Lc/k/a/d;

    array-length v0, v0

    new-array v0, v0, [Ljava/util/HashMap;

    iput-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    .line 4
    new-instance v0, Ljava/util/HashSet;

    sget-object v1, Lc/k/a/g;->T:[[Lc/k/a/d;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lc/k/a/g;->g:Ljava/util/Set;

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_5

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lc/k/a/g;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_2

    .line 7
    new-instance p2, Ljava/io/BufferedInputStream;

    sget-object v2, Lc/k/a/g;->a0:[B

    array-length v2, v2

    invoke-direct {p2, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 8
    invoke-static {p2}, Lc/k/a/g;->b(Ljava/io/BufferedInputStream;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "ExifInterface"

    const-string p2, "Given data does not follow the structure of an Exif-only data."

    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 10
    :cond_1
    iput-boolean v1, p0, Lc/k/a/g;->e:Z

    .line 11
    iput-object v0, p0, Lc/k/a/g;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 12
    iput-object v0, p0, Lc/k/a/g;->b:Ljava/io/FileDescriptor;

    move-object p1, p2

    goto :goto_1

    .line 13
    :cond_2
    instance-of p2, p1, Landroid/content/res/AssetManager$AssetInputStream;

    if-eqz p2, :cond_3

    .line 14
    move-object p2, p1

    check-cast p2, Landroid/content/res/AssetManager$AssetInputStream;

    iput-object p2, p0, Lc/k/a/g;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 15
    iput-object v0, p0, Lc/k/a/g;->b:Ljava/io/FileDescriptor;

    goto :goto_1

    .line 16
    :cond_3
    instance-of p2, p1, Ljava/io/FileInputStream;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Ljava/io/FileInputStream;

    .line 17
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-static {v1}, Lc/k/a/g;->a(Ljava/io/FileDescriptor;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 18
    iput-object v0, p0, Lc/k/a/g;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 19
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    iput-object p2, p0, Lc/k/a/g;->b:Ljava/io/FileDescriptor;

    goto :goto_1

    .line 20
    :cond_4
    iput-object v0, p0, Lc/k/a/g;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 21
    iput-object v0, p0, Lc/k/a/g;->b:Ljava/io/FileDescriptor;

    .line 22
    :goto_1
    invoke-virtual {p0, p1}, Lc/k/a/g;->a(Ljava/io/InputStream;)V

    return-void

    .line 23
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "inputStream cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(I)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0xe

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static a(Ljava/io/FileDescriptor;)Z
    .locals 4

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    const-wide/16 v2, 0x0

    .line 60
    :try_start_0
    sget v0, Landroid/system/OsConstants;->SEEK_CUR:I

    invoke-static {p0, v2, v3, v0}, Lc/k/a/h;->a(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    nop

    .line 61
    sget-boolean p0, Lc/k/a/g;->o:Z

    if-eqz p0, :cond_0

    const-string p0, "ExifInterface"

    const-string v0, "The file descriptor for the given input is not seekable"

    .line 62
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return v1
.end method

.method public static b(Ljava/io/BufferedInputStream;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    sget-object v0, Lc/k/a/g;->a0:[B

    array-length v0, v0

    invoke-virtual {p0, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 22
    sget-object v0, Lc/k/a/g;->a0:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 23
    invoke-virtual {p0, v0}, Ljava/io/BufferedInputStream;->read([B)I

    .line 24
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->reset()V

    const/4 p0, 0x0

    const/4 v1, 0x0

    .line 25
    :goto_0
    sget-object v2, Lc/k/a/g;->a0:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 26
    aget-byte v3, v0, v1

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_0

    return p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static g([B)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    sget-object v2, Lc/k/a/g;->r:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 2
    aget-byte v3, p0, v1

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(Ljava/io/BufferedInputStream;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x1388

    .line 63
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    new-array v0, v0, [B

    .line 64
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->read([B)I

    .line 65
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V

    .line 66
    invoke-static {v0}, Lc/k/a/g;->g([B)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    return p1

    .line 67
    :cond_0
    invoke-virtual {p0, v0}, Lc/k/a/g;->d([B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x9

    return p1

    .line 68
    :cond_1
    invoke-virtual {p0, v0}, Lc/k/a/g;->a([B)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0xc

    return p1

    .line 69
    :cond_2
    invoke-virtual {p0, v0}, Lc/k/a/g;->b([B)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x7

    return p1

    .line 70
    :cond_3
    invoke-virtual {p0, v0}, Lc/k/a/g;->e([B)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0xa

    return p1

    .line 71
    :cond_4
    invoke-virtual {p0, v0}, Lc/k/a/g;->c([B)Z

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0xd

    return p1

    .line 72
    :cond_5
    invoke-virtual {p0, v0}, Lc/k/a/g;->f([B)Z

    move-result p1

    if-eqz p1, :cond_6

    const/16 p1, 0xe

    return p1

    :cond_6
    const/4 p1, 0x0

    return p1
.end method

.method public a(Ljava/lang/String;I)I
    .locals 1

    if-eqz p1, :cond_1

    .line 17
    invoke-virtual {p0, p1}, Lc/k/a/g;->b(Ljava/lang/String;)Lc/k/a/c;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return p2

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "tag shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-eqz p1, :cond_6

    .line 1
    invoke-virtual {p0, p1}, Lc/k/a/g;->b(Ljava/lang/String;)Lc/k/a/c;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 2
    sget-object v2, Lc/k/a/g;->X:Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc/k/a/c;->c(Ljava/nio/ByteOrder;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v2, "GPSTimeStamp"

    .line 4
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 5
    iget p1, v0, Lc/k/a/c;->a:I

    const/4 v2, 0x5

    const-string v3, "ExifInterface"

    if-eq p1, v2, :cond_1

    const/16 v2, 0xa

    if-eq p1, v2, :cond_1

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GPS Timestamp format is not rational. format="

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lc/k/a/c;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 7
    :cond_1
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc/k/a/c;->d(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lc/k/a/e;

    if-eqz p1, :cond_3

    .line 8
    array-length v0, p1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    goto :goto_0

    :cond_2
    new-array v0, v2, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 9
    aget-object v2, p1, v1

    iget-wide v2, v2, Lc/k/a/e;->a:J

    long-to-float v2, v2

    aget-object v3, p1, v1

    iget-wide v3, v3, Lc/k/a/e;->b:J

    long-to-float v3, v3

    div-float/2addr v2, v3

    float-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aget-object v2, p1, v1

    iget-wide v2, v2, Lc/k/a/e;->a:J

    long-to-float v2, v2

    aget-object v3, p1, v1

    iget-wide v3, v3, Lc/k/a/e;->b:J

    long-to-float v3, v3

    div-float/2addr v2, v3

    float-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aget-object v2, p1, v1

    iget-wide v2, v2, Lc/k/a/e;->a:J

    long-to-float v2, v2

    aget-object p1, p1, v1

    iget-wide v3, p1, Lc/k/a/e;->b:J

    long-to-float p1, v3

    div-float/2addr v2, p1

    float-to-int p1, v2

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "%02d:%02d:%02d"

    .line 13
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 14
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid GPS Timestamp array. array="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 15
    :cond_4
    :try_start_0
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc/k/a/c;->a(Ljava/nio/ByteOrder;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_5
    return-object v1

    .line 16
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "tag shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a()V
    .locals 6

    const-string v0, "DateTimeOriginal"

    .line 213
    invoke-virtual {p0, v0}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "DateTime"

    .line 214
    invoke-virtual {p0, v2}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    .line 215
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v1

    .line 216
    invoke-static {v0}, Lc/k/a/c;->a(Ljava/lang/String;)Lc/k/a/c;

    move-result-object v0

    .line 217
    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v0, "ImageWidth"

    .line 218
    invoke-virtual {p0, v0}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-nez v2, :cond_1

    .line 219
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v1

    iget-object v5, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 220
    invoke-static {v3, v4, v5}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v5

    .line 221
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v0, "ImageLength"

    .line 222
    invoke-virtual {p0, v0}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    .line 223
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v1

    iget-object v5, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 224
    invoke-static {v3, v4, v5}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v5

    .line 225
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v0, "Orientation"

    .line 226
    invoke-virtual {p0, v0}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    .line 227
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v2, v1

    iget-object v2, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 228
    invoke-static {v3, v4, v2}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v2

    .line 229
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v0, "LightSource"

    .line 230
    invoke-virtual {p0, v0}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    .line 231
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    iget-object v2, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 232
    invoke-static {v3, v4, v2}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v2

    .line 233
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public final a(II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 348
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    const-string v1, "ExifInterface"

    if-nez v0, :cond_6

    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 349
    :cond_0
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    const-string v2, "ImageLength"

    .line 350
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    .line 351
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, p1

    const-string v4, "ImageWidth"

    .line 352
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/k/a/c;

    .line 353
    iget-object v5, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v5, v5, p2

    .line 354
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/k/a/c;

    .line 355
    iget-object v5, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v5, v5, p2

    .line 356
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/k/a/c;

    if-eqz v0, :cond_4

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_3

    if-nez v4, :cond_2

    goto :goto_0

    .line 357
    :cond_2
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v0

    .line 358
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v1

    .line 359
    iget-object v3, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v2

    .line 360
    iget-object v3, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v3}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v3

    if-ge v0, v2, :cond_5

    if-ge v1, v3, :cond_5

    .line 361
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v0, p1

    .line 362
    aget-object v2, v0, p2

    aput-object v2, v0, p1

    .line 363
    aput-object v1, v0, p2

    goto :goto_2

    .line 364
    :cond_3
    :goto_0
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_5

    const-string p1, "Second image does not contain valid size information"

    .line 365
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 366
    :cond_4
    :goto_1
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_5

    const-string p1, "First image does not contain valid size information"

    .line 367
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_2
    return-void

    .line 368
    :cond_6
    :goto_3
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_7

    const-string p1, "Cannot perform swap since only one image data exists"

    .line 369
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    return-void
.end method

.method public final a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 370
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 371
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 372
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v0, p1

    aget-object v0, v0, p1

    .line 373
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 374
    invoke-virtual {v1, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    iget-object p3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object p1, p3, p1

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final a(Lc/k/a/b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 181
    sget-boolean v0, Lc/k/a/g;->o:Z

    if-eqz v0, :cond_0

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getPngAttributes starting with: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 184
    sget-object v0, Lc/k/a/g;->x:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Lc/k/a/b;->a(I)V

    .line 185
    sget-object v0, Lc/k/a/g;->x:[B

    array-length v0, v0

    const/4 v1, 0x0

    add-int/2addr v0, v1

    .line 186
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lc/k/a/b;->readInt()I

    move-result v2

    const/4 v3, 0x4

    add-int/2addr v0, v3

    new-array v4, v3, [B

    .line 187
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-ne v5, v3, :cond_7

    add-int/2addr v0, v3

    const/16 v3, 0x10

    if-ne v0, v3, :cond_2

    .line 188
    sget-object v3, Lc/k/a/g;->z:[B

    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 189
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 190
    :cond_2
    :goto_1
    sget-object v3, Lc/k/a/g;->A:[B

    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    .line 191
    :cond_3
    sget-object v3, Lc/k/a/g;->y:[B

    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 192
    new-array v3, v2, [B

    .line 193
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-ne v5, v2, :cond_5

    .line 194
    invoke-virtual {p1}, Lc/k/a/b;->readInt()I

    move-result p1

    .line 195
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    .line 196
    invoke-virtual {v2, v4}, Ljava/util/zip/CRC32;->update([B)V

    .line 197
    invoke-virtual {v2, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 198
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v4

    long-to-int v5, v4

    if-ne v5, p1, :cond_4

    .line 199
    iput v0, p0, Lc/k/a/g;->k:I

    .line 200
    invoke-virtual {p0, v3, v1}, Lc/k/a/g;->a([BI)V

    .line 201
    invoke-virtual {p0}, Lc/k/a/g;->c()V

    .line 202
    new-instance p1, Lc/k/a/b;

    invoke-direct {p1, v3}, Lc/k/a/b;-><init>([B)V

    invoke-virtual {p0, p1}, Lc/k/a/g;->f(Lc/k/a/b;)V

    :goto_2
    return-void

    .line 203
    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", calculated CRC value: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_5
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to read given length for given PNG chunk type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    invoke-static {v4}, Lc/k/a/j;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    add-int/lit8 v2, v2, 0x4

    .line 207
    invoke-virtual {p1, v2}, Lc/k/a/b;->a(I)V

    add-int/2addr v0, v2

    goto/16 :goto_0

    .line 208
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Encountered invalid length while parsing PNG chunktype"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    :catch_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Encountered corrupt PNG file."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lc/k/a/b;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    .line 93
    sget-boolean v3, Lc/k/a/g;->o:Z

    const-string v4, "ExifInterface"

    if-eqz v3, :cond_0

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getJpegAttributes starting with: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    :cond_0
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v3}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 96
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readByte()B

    move-result v3

    const-string v5, "Invalid marker: "

    const/4 v6, -0x1

    if-ne v3, v6, :cond_11

    .line 97
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readByte()B

    move-result v7

    const/16 v8, -0x28

    if-ne v7, v8, :cond_10

    const/4 v3, 0x2

    const/4 v5, 0x2

    .line 98
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readByte()B

    move-result v7

    if-ne v7, v6, :cond_f

    const/4 v7, 0x1

    add-int/2addr v5, v7

    .line 99
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readByte()B

    move-result v8

    .line 100
    sget-boolean v9, Lc/k/a/g;->o:Z

    if-eqz v9, :cond_1

    .line 101
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Found JPEG segment indicator: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v10, v8, 0xff

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    add-int/2addr v5, v7

    const/16 v9, -0x27

    if-eq v8, v9, :cond_e

    const/16 v9, -0x26

    if-ne v8, v9, :cond_2

    goto/16 :goto_8

    .line 102
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v9

    sub-int/2addr v9, v3

    add-int/2addr v5, v3

    .line 103
    sget-boolean v10, Lc/k/a/g;->o:Z

    if-eqz v10, :cond_3

    .line 104
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "JPEG segment: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v11, v8, 0xff

    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " (length: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v9, 0x2

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ")"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const-string v10, "Invalid length"

    if-ltz v9, :cond_d

    const/16 v11, -0x1f

    const/4 v12, 0x0

    if-eq v8, v11, :cond_9

    const/4 v11, -0x2

    if-eq v8, v11, :cond_6

    packed-switch v8, :pswitch_data_0

    packed-switch v8, :pswitch_data_1

    packed-switch v8, :pswitch_data_2

    packed-switch v8, :pswitch_data_3

    :goto_1
    move-object/from16 v19, v4

    goto/16 :goto_7

    .line 105
    :pswitch_0
    invoke-virtual {v1, v7}, Lc/k/a/b;->a(I)V

    .line 106
    iget-object v7, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v2

    const/4 v8, 0x4

    if-eq v2, v8, :cond_4

    const-string v11, "ImageLength"

    goto :goto_2

    :cond_4
    const-string v11, "ThumbnailImageLength"

    .line 107
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v12

    int-to-long v12, v12

    iget-object v14, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-static {v12, v13, v14}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v12

    .line 108
    invoke-virtual {v7, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    iget-object v7, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v2

    if-eq v2, v8, :cond_5

    const-string v8, "ImageWidth"

    goto :goto_3

    :cond_5
    const-string v8, "ThumbnailImageWidth"

    .line 110
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v11

    int-to-long v11, v11

    iget-object v13, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-static {v11, v12, v13}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v11

    .line 111
    invoke-virtual {v7, v8, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, -0x5

    goto :goto_1

    .line 112
    :cond_6
    new-array v8, v9, [B

    .line 113
    invoke-virtual {v1, v8}, Ljava/io/InputStream;->read([B)I

    move-result v11

    if-ne v11, v9, :cond_8

    const-string v9, "UserComment"

    .line 114
    invoke-virtual {v0, v9}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_7

    .line 115
    iget-object v11, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v7, v11, v7

    new-instance v11, Ljava/lang/String;

    sget-object v13, Lc/k/a/g;->Z:Ljava/nio/charset/Charset;

    invoke-direct {v11, v8, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v11}, Lc/k/a/c;->a(Ljava/lang/String;)Lc/k/a/c;

    move-result-object v8

    invoke-virtual {v7, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    move-object/from16 v19, v4

    goto/16 :goto_6

    .line 116
    :cond_8
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid exif"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 117
    :cond_9
    new-array v7, v9, [B

    .line 118
    invoke-virtual {v1, v7}, Lc/k/a/b;->readFully([B)V

    add-int v8, v5, v9

    .line 119
    sget-object v11, Lc/k/a/g;->a0:[B

    invoke-static {v7, v11}, Lc/k/a/j;->a([B[B)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 120
    sget-object v11, Lc/k/a/g;->a0:[B

    array-length v11, v11

    invoke-static {v7, v11, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v7

    add-int v5, p2, v5

    .line 121
    sget-object v9, Lc/k/a/g;->a0:[B

    array-length v9, v9

    add-int/2addr v5, v9

    iput v5, v0, Lc/k/a/g;->k:I

    .line 122
    invoke-virtual {v0, v7, v2}, Lc/k/a/g;->a([BI)V

    .line 123
    new-instance v5, Lc/k/a/b;

    invoke-direct {v5, v7}, Lc/k/a/b;-><init>([B)V

    invoke-virtual {v0, v5}, Lc/k/a/g;->f(Lc/k/a/b;)V

    goto :goto_4

    .line 124
    :cond_a
    sget-object v11, Lc/k/a/g;->b0:[B

    invoke-static {v7, v11}, Lc/k/a/j;->a([B[B)Z

    move-result v11

    if-eqz v11, :cond_b

    .line 125
    sget-object v11, Lc/k/a/g;->b0:[B

    array-length v13, v11

    add-int/2addr v5, v13

    .line 126
    array-length v11, v11

    invoke-static {v7, v11, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v7

    const-string v9, "Xmp"

    .line 127
    invoke-virtual {v0, v9}, Lc/k/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_b

    .line 128
    iget-object v11, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v11, v11, v12

    new-instance v15, Lc/k/a/c;

    const/4 v14, 0x1

    array-length v13, v7

    move-object/from16 v19, v4

    int-to-long v3, v5

    move v5, v13

    move-object v13, v15

    move-object v6, v15

    move v15, v5

    move-wide/from16 v16, v3

    move-object/from16 v18, v7

    invoke-direct/range {v13 .. v18}, Lc/k/a/c;-><init>(IIJ[B)V

    invoke-virtual {v11, v9, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_b
    :goto_4
    move-object/from16 v19, v4

    :goto_5
    move v5, v8

    :goto_6
    const/4 v9, 0x0

    :goto_7
    if-ltz v9, :cond_c

    .line 129
    invoke-virtual {v1, v9}, Lc/k/a/b;->a(I)V

    add-int/2addr v5, v9

    move-object/from16 v4, v19

    const/4 v3, 0x2

    const/4 v6, -0x1

    goto/16 :goto_0

    .line 130
    :cond_c
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 131
    :cond_d
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 132
    :cond_e
    :goto_8
    iget-object v2, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    return-void

    .line 133
    :cond_f
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid marker:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v3, v7, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 134
    :cond_10
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 135
    :cond_11
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lc/k/a/b;Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "JPEGInterchangeFormat"

    .line 324
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    const-string v1, "JPEGInterchangeFormatLength"

    .line 325
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/k/a/c;

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    .line 326
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v0

    .line 327
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p2, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result p2

    .line 328
    iget v1, p0, Lc/k/a/g;->d:I

    const/4 v2, 0x7

    if-ne v1, v2, :cond_0

    .line 329
    iget v1, p0, Lc/k/a/g;->l:I

    add-int/2addr v0, v1

    :cond_0
    if-lez v0, :cond_1

    if-lez p2, :cond_1

    .line 330
    iget-object v1, p0, Lc/k/a/g;->a:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p0, Lc/k/a/g;->c:Landroid/content/res/AssetManager$AssetInputStream;

    if-nez v1, :cond_1

    iget-object v1, p0, Lc/k/a/g;->b:Ljava/io/FileDescriptor;

    if-nez v1, :cond_1

    .line 331
    new-array v1, p2, [B

    int-to-long v2, v0

    .line 332
    invoke-virtual {p1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    .line 333
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 334
    :cond_1
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_2

    .line 335
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setting thumbnail attributes with offset: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", length: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ExifInterface"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public final a(Lc/k/a/f;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "yes"

    .line 136
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_e

    .line 137
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 138
    :try_start_0
    new-instance v2, Lc/k/a/a;

    invoke-direct {v2, p0, p1}, Lc/k/a/a;-><init>(Lc/k/a/g;Lc/k/a/f;)V

    invoke-static {v1, v2}, Lc/k/a/i;->a(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V

    const/16 v2, 0x21

    .line 139
    invoke-virtual {v1, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x22

    .line 140
    invoke-virtual {v1, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x1a

    .line 141
    invoke-virtual {v1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x11

    .line 142
    invoke-virtual {v1, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    .line 143
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    const/16 v0, 0x1d

    .line 144
    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6

    const/16 v0, 0x1e

    .line 145
    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/16 v4, 0x1f

    .line 146
    invoke-virtual {v1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x12

    .line 148
    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6

    const/16 v0, 0x13

    .line 149
    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/16 v4, 0x18

    .line 150
    invoke-virtual {v1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v0, v6

    move-object v4, v0

    :goto_0
    const/4 v5, 0x0

    if-eqz v6, :cond_2

    .line 151
    iget-object v7, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v5

    const-string v8, "ImageWidth"

    .line 152
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    iget-object v10, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-static {v9, v10}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v9

    .line 153
    invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz v0, :cond_3

    .line 154
    iget-object v7, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v5

    const-string v8, "ImageLength"

    .line 155
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    iget-object v10, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-static {v9, v10}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v9

    .line 156
    invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 v7, 0x6

    if-eqz v4, :cond_7

    const/4 v8, 0x1

    .line 157
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/16 v10, 0x5a

    if-eq v9, v10, :cond_6

    const/16 v10, 0xb4

    if-eq v9, v10, :cond_5

    const/16 v10, 0x10e

    if-eq v9, v10, :cond_4

    goto :goto_1

    :cond_4
    const/16 v8, 0x8

    goto :goto_1

    :cond_5
    const/4 v8, 0x3

    goto :goto_1

    :cond_6
    const/4 v8, 0x6

    .line 158
    :goto_1
    iget-object v9, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v9, v9, v5

    const-string v10, "Orientation"

    iget-object v11, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 159
    invoke-static {v8, v11}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v8

    .line 160
    invoke-virtual {v9, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    if-eqz v2, :cond_c

    if-eqz v3, :cond_c

    .line 161
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 162
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-le v3, v7, :cond_b

    int-to-long v8, v2

    .line 163
    invoke-virtual {p1, v8, v9}, Lc/k/a/f;->g(J)V

    new-array v8, v7, [B

    .line 164
    invoke-virtual {p1, v8}, Ljava/io/InputStream;->read([B)I

    move-result v9

    if-ne v9, v7, :cond_a

    add-int/2addr v2, v7

    add-int/lit8 v3, v3, -0x6

    .line 165
    sget-object v7, Lc/k/a/g;->a0:[B

    invoke-static {v8, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 166
    new-array v7, v3, [B

    .line 167
    invoke-virtual {p1, v7}, Ljava/io/InputStream;->read([B)I

    move-result p1

    if-ne p1, v3, :cond_8

    .line 168
    iput v2, p0, Lc/k/a/g;->k:I

    .line 169
    invoke-virtual {p0, v7, v5}, Lc/k/a/g;->a([BI)V

    goto :goto_2

    .line 170
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Can\'t read exif"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 171
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid identifier"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 172
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Can\'t read identifier"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 173
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid exif length"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 174
    :cond_c
    :goto_2
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_d

    const-string p1, "ExifInterface"

    .line 175
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Heif meta: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", rotation "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    :cond_d
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 177
    :catch_0
    :try_start_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    :goto_3
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 179
    throw p1

    .line 180
    :cond_e
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Reading EXIF from HEIF files is supported from SDK 28 and above"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lc/k/a/f;I)V
    .locals 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 234
    iget-object v3, v0, Lc/k/a/g;->g:Ljava/util/Set;

    iget v4, v1, Lc/k/a/b;->d:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 235
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readShort()S

    move-result v3

    .line 236
    sget-boolean v4, Lc/k/a/g;->o:Z

    const-string v5, "ExifInterface"

    if-eqz v4, :cond_0

    .line 237
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "numberOfDirectoryEntry: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-gtz v3, :cond_1

    return-void

    :cond_1
    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x5

    if-ge v6, v3, :cond_23

    .line 238
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v12

    .line 239
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v13

    .line 240
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readInt()I

    move-result v15

    .line 241
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->c()I

    move-result v14

    int-to-long v8, v14

    const-wide/16 v18, 0x4

    add-long v8, v8, v18

    .line 242
    sget-object v14, Lc/k/a/g;->V:[Ljava/util/HashMap;

    aget-object v14, v14, v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc/k/a/d;

    .line 243
    sget-boolean v14, Lc/k/a/g;->o:Z

    const/4 v10, 0x3

    if-eqz v14, :cond_3

    new-array v7, v7, [Ljava/lang/Object;

    .line 244
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v7, v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v21, 0x1

    aput-object v14, v7, v21

    if-eqz v11, :cond_2

    .line 245
    iget-object v14, v11, Lc/k/a/d;->b:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v14, 0x0

    :goto_1
    const/16 v22, 0x2

    aput-object v14, v7, v22

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v7, v10

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v20, 0x4

    aput-object v14, v7, v20

    const-string v14, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    .line 246
    invoke-static {v14, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const/4 v7, 0x7

    if-nez v11, :cond_5

    .line 247
    sget-boolean v14, Lc/k/a/g;->o:Z

    if-eqz v14, :cond_4

    .line 248
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skip the tag entry since tag number is not defined: "

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_2
    move-wide/from16 v23, v8

    move-object v4, v11

    goto/16 :goto_5

    :cond_5
    if-lez v13, :cond_b

    .line 249
    sget-object v4, Lc/k/a/g;->H:[I

    array-length v4, v4

    if-lt v13, v4, :cond_6

    goto :goto_4

    .line 250
    :cond_6
    invoke-virtual {v11, v13}, Lc/k/a/d;->a(I)Z

    move-result v4

    if-nez v4, :cond_7

    .line 251
    sget-boolean v4, Lc/k/a/g;->o:Z

    if-eqz v4, :cond_4

    .line 252
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Skip the tag entry since data format ("

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v14, Lc/k/a/g;->G:[Ljava/lang/String;

    aget-object v14, v14, v13

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ") is unexpected for tag: "

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v14, v11, Lc/k/a/d;->b:Ljava/lang/String;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_7
    if-ne v13, v7, :cond_8

    .line 253
    iget v13, v11, Lc/k/a/d;->c:I

    :cond_8
    move-object v4, v11

    int-to-long v10, v15

    .line 254
    sget-object v14, Lc/k/a/g;->H:[I

    aget v14, v14, v13

    move-wide/from16 v23, v8

    int-to-long v7, v14

    mul-long v7, v7, v10

    const-wide/16 v10, 0x0

    cmp-long v14, v7, v10

    if-ltz v14, :cond_a

    const-wide/32 v10, 0x7fffffff

    cmp-long v14, v7, v10

    if-lez v14, :cond_9

    goto :goto_3

    :cond_9
    const/4 v10, 0x1

    goto :goto_7

    .line 255
    :cond_a
    :goto_3
    sget-boolean v10, Lc/k/a/g;->o:Z

    if-eqz v10, :cond_d

    .line 256
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Skip the tag entry since the number of components is invalid: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :cond_b
    :goto_4
    move-wide/from16 v23, v8

    move-object v4, v11

    .line 257
    sget-boolean v7, Lc/k/a/g;->o:Z

    if-eqz v7, :cond_c

    .line 258
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Skip the tag entry since data format is invalid: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    :goto_5
    const-wide/16 v7, 0x0

    :cond_d
    :goto_6
    const/4 v10, 0x0

    :goto_7
    if-nez v10, :cond_e

    move-wide/from16 v10, v23

    .line 259
    invoke-virtual {v1, v10, v11}, Lc/k/a/f;->g(J)V

    move/from16 v23, v3

    move/from16 v24, v6

    goto/16 :goto_f

    :cond_e
    move-wide/from16 v10, v23

    const-string v14, "Compression"

    cmp-long v23, v7, v18

    if-lez v23, :cond_12

    .line 260
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readInt()I

    move-result v9

    .line 261
    sget-boolean v19, Lc/k/a/g;->o:Z

    move/from16 v23, v3

    if-eqz v19, :cond_f

    .line 262
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v24, v6

    const-string v6, "seek to data offset: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :cond_f
    move/from16 v24, v6

    .line 263
    :goto_8
    iget v3, v0, Lc/k/a/g;->d:I

    const/4 v6, 0x7

    if-ne v3, v6, :cond_11

    .line 264
    iget-object v3, v4, Lc/k/a/d;->b:Ljava/lang/String;

    const-string v6, "MakerNote"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 265
    iput v9, v0, Lc/k/a/g;->l:I

    goto :goto_9

    :cond_10
    const/4 v3, 0x6

    if-ne v2, v3, :cond_11

    .line 266
    iget-object v6, v4, Lc/k/a/d;->b:Ljava/lang/String;

    const-string v3, "ThumbnailImage"

    .line 267
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 268
    iput v9, v0, Lc/k/a/g;->m:I

    .line 269
    iput v15, v0, Lc/k/a/g;->n:I

    .line 270
    iget-object v3, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    const/4 v6, 0x6

    .line 271
    invoke-static {v6, v3}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v3

    .line 272
    iget v6, v0, Lc/k/a/g;->m:I

    move-wide/from16 v25, v10

    int-to-long v10, v6

    iget-object v6, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 273
    invoke-static {v10, v11, v6}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v6

    .line 274
    iget v10, v0, Lc/k/a/g;->n:I

    int-to-long v10, v10

    move/from16 v18, v15

    iget-object v15, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 275
    invoke-static {v10, v11, v15}, Lc/k/a/c;->a(JLjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v10

    .line 276
    iget-object v11, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v15, 0x4

    aget-object v11, v11, v15

    invoke-virtual {v11, v14, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    iget-object v3, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v15

    const-string v11, "JPEGInterchangeFormat"

    invoke-virtual {v3, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    iget-object v3, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v15

    const-string v6, "JPEGInterchangeFormatLength"

    invoke-virtual {v3, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_11
    :goto_9
    move-wide/from16 v25, v10

    move/from16 v18, v15

    :goto_a
    int-to-long v9, v9

    .line 279
    invoke-virtual {v1, v9, v10}, Lc/k/a/f;->g(J)V

    goto :goto_b

    :cond_12
    move/from16 v23, v3

    move/from16 v24, v6

    move-wide/from16 v25, v10

    move/from16 v18, v15

    .line 280
    :goto_b
    sget-object v3, Lc/k/a/g;->Y:Ljava/util/HashMap;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 281
    sget-boolean v6, Lc/k/a/g;->o:Z

    if-eqz v6, :cond_13

    .line 282
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "nextIfdType: "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " byteCount: "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    const/16 v6, 0x8

    if-eqz v3, :cond_1c

    const-wide/16 v7, -0x1

    const/4 v9, 0x3

    if-eq v13, v9, :cond_17

    const/4 v9, 0x4

    if-eq v13, v9, :cond_16

    if-eq v13, v6, :cond_15

    const/16 v6, 0x9

    if-eq v13, v6, :cond_14

    const/16 v6, 0xd

    if-eq v13, v6, :cond_14

    goto :goto_d

    .line 283
    :cond_14
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readInt()I

    move-result v6

    goto :goto_c

    .line 284
    :cond_15
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readShort()S

    move-result v6

    goto :goto_c

    .line 285
    :cond_16
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->l()J

    move-result-wide v7

    goto :goto_d

    .line 286
    :cond_17
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v6

    :goto_c
    int-to-long v7, v6

    .line 287
    :goto_d
    sget-boolean v6, Lc/k/a/g;->o:Z

    if-eqz v6, :cond_18

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    .line 288
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v6, v10

    iget-object v4, v4, Lc/k/a/d;->b:Ljava/lang/String;

    const/4 v9, 0x1

    aput-object v4, v6, v9

    const-string v4, "Offset: %d, tagName: %s"

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_18
    const-wide/16 v9, 0x0

    cmp-long v4, v7, v9

    if-lez v4, :cond_1a

    .line 289
    iget-object v4, v0, Lc/k/a/g;->g:Ljava/util/Set;

    long-to-int v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    .line 290
    invoke-virtual {v1, v7, v8}, Lc/k/a/f;->g(J)V

    .line 291
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lc/k/a/g;->a(Lc/k/a/f;I)V

    goto :goto_e

    .line 292
    :cond_19
    sget-boolean v4, Lc/k/a/g;->o:Z

    if-eqz v4, :cond_1b

    .line 293
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Skip jump into the IFD since it has already been read: IfdType "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " (at "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_e

    .line 294
    :cond_1a
    sget-boolean v3, Lc/k/a/g;->o:Z

    if-eqz v3, :cond_1b

    .line 295
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skip jump into the IFD since its offset is invalid: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1b
    :goto_e
    move-wide/from16 v9, v25

    .line 296
    invoke-virtual {v1, v9, v10}, Lc/k/a/f;->g(J)V

    goto/16 :goto_f

    :cond_1c
    move-wide/from16 v9, v25

    .line 297
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->c()I

    move-result v3

    iget v11, v0, Lc/k/a/g;->k:I

    add-int/2addr v3, v11

    long-to-int v8, v7

    .line 298
    new-array v7, v8, [B

    .line 299
    invoke-virtual {v1, v7}, Lc/k/a/b;->readFully([B)V

    .line 300
    new-instance v8, Lc/k/a/c;

    int-to-long v11, v3

    move-object v3, v14

    move-object v14, v8

    move/from16 v16, v18

    move v15, v13

    move-wide/from16 v17, v11

    move-object/from16 v19, v7

    invoke-direct/range {v14 .. v19}, Lc/k/a/c;-><init>(IIJ[B)V

    .line 301
    iget-object v7, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v2

    iget-object v11, v4, Lc/k/a/d;->b:Ljava/lang/String;

    invoke-virtual {v7, v11, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    iget-object v7, v4, Lc/k/a/d;->b:Ljava/lang/String;

    const-string v11, "DNGVersion"

    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1d

    const/4 v7, 0x3

    .line 303
    iput v7, v0, Lc/k/a/g;->d:I

    .line 304
    :cond_1d
    iget-object v7, v4, Lc/k/a/d;->b:Ljava/lang/String;

    const-string v11, "Make"

    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    iget-object v7, v4, Lc/k/a/d;->b:Ljava/lang/String;

    const-string v11, "Model"

    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    :cond_1e
    iget-object v7, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 305
    invoke-virtual {v8, v7}, Lc/k/a/c;->c(Ljava/nio/ByteOrder;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "PENTAX"

    invoke-virtual {v7, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_20

    :cond_1f
    iget-object v4, v4, Lc/k/a/d;->b:Ljava/lang/String;

    .line 306
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_21

    iget-object v3, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 307
    invoke-virtual {v8, v3}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v3

    const v4, 0xffff

    if-ne v3, v4, :cond_21

    .line 308
    :cond_20
    iput v6, v0, Lc/k/a/g;->d:I

    .line 309
    :cond_21
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->c()I

    move-result v3

    int-to-long v3, v3

    cmp-long v6, v3, v9

    if-eqz v6, :cond_22

    .line 310
    invoke-virtual {v1, v9, v10}, Lc/k/a/f;->g(J)V

    :cond_22
    :goto_f
    add-int/lit8 v6, v24, 0x1

    int-to-short v6, v6

    move/from16 v3, v23

    const/4 v4, 0x0

    goto/16 :goto_0

    .line 311
    :cond_23
    invoke-virtual/range {p1 .. p1}, Lc/k/a/b;->readInt()I

    move-result v2

    .line 312
    sget-boolean v3, Lc/k/a/g;->o:Z

    if-eqz v3, :cond_24

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 313
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x0

    aput-object v4, v3, v6

    const-string v4, "nextIfdOffset: %d"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_24
    int-to-long v3, v2

    const-wide/16 v8, 0x0

    cmp-long v6, v3, v8

    if-lez v6, :cond_27

    .line 314
    iget-object v6, v0, Lc/k/a/g;->g:Ljava/util/Set;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_26

    .line 315
    invoke-virtual {v1, v3, v4}, Lc/k/a/f;->g(J)V

    .line 316
    iget-object v2, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_25

    .line 317
    invoke-virtual {v0, v1, v3}, Lc/k/a/g;->a(Lc/k/a/f;I)V

    goto :goto_10

    .line 318
    :cond_25
    iget-object v2, v0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v7

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_28

    .line 319
    invoke-virtual {v0, v1, v7}, Lc/k/a/g;->a(Lc/k/a/f;I)V

    goto :goto_10

    .line 320
    :cond_26
    sget-boolean v1, Lc/k/a/g;->o:Z

    if-eqz v1, :cond_28

    .line 321
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_10

    .line 322
    :cond_27
    sget-boolean v1, Lc/k/a/g;->o:Z

    if-eqz v1, :cond_28

    .line 323
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_28
    :goto_10
    return-void
.end method

.method public final a(Ljava/io/InputStream;)V
    .locals 4

    if-eqz p1, :cond_e

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 20
    :goto_0
    :try_start_0
    sget-object v2, Lc/k/a/g;->T:[[Lc/k/a/d;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 21
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 22
    :cond_0
    iget-boolean v1, p0, Lc/k/a/g;->e:Z

    if-nez v1, :cond_1

    .line 23
    new-instance v1, Ljava/io/BufferedInputStream;

    const/16 v2, 0x1388

    invoke-direct {v1, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 24
    invoke-virtual {p0, v1}, Lc/k/a/g;->a(Ljava/io/BufferedInputStream;)I

    move-result p1

    iput p1, p0, Lc/k/a/g;->d:I

    move-object p1, v1

    .line 25
    :cond_1
    iget v1, p0, Lc/k/a/g;->d:I

    invoke-static {v1}, Lc/k/a/g;->a(I)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 26
    new-instance v0, Lc/k/a/f;

    invoke-direct {v0, p1}, Lc/k/a/f;-><init>(Ljava/io/InputStream;)V

    .line 27
    iget-boolean p1, p0, Lc/k/a/g;->e:Z

    if-eqz p1, :cond_2

    .line 28
    invoke-virtual {p0, v0}, Lc/k/a/g;->e(Lc/k/a/f;)V

    goto :goto_1

    .line 29
    :cond_2
    iget p1, p0, Lc/k/a/g;->d:I

    const/16 v1, 0xc

    if-ne p1, v1, :cond_3

    .line 30
    invoke-virtual {p0, v0}, Lc/k/a/g;->a(Lc/k/a/f;)V

    goto :goto_1

    .line 31
    :cond_3
    iget p1, p0, Lc/k/a/g;->d:I

    const/4 v1, 0x7

    if-ne p1, v1, :cond_4

    .line 32
    invoke-virtual {p0, v0}, Lc/k/a/g;->b(Lc/k/a/f;)V

    goto :goto_1

    .line 33
    :cond_4
    iget p1, p0, Lc/k/a/g;->d:I

    const/16 v1, 0xa

    if-ne p1, v1, :cond_5

    .line 34
    invoke-virtual {p0, v0}, Lc/k/a/g;->d(Lc/k/a/f;)V

    goto :goto_1

    .line 35
    :cond_5
    invoke-virtual {p0, v0}, Lc/k/a/g;->c(Lc/k/a/f;)V

    .line 36
    :goto_1
    iget p1, p0, Lc/k/a/g;->k:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lc/k/a/f;->g(J)V

    .line 37
    invoke-virtual {p0, v0}, Lc/k/a/g;->f(Lc/k/a/b;)V

    goto :goto_2

    .line 38
    :cond_6
    new-instance v1, Lc/k/a/b;

    invoke-direct {v1, p1}, Lc/k/a/b;-><init>(Ljava/io/InputStream;)V

    .line 39
    iget p1, p0, Lc/k/a/g;->d:I

    const/4 v2, 0x4

    if-ne p1, v2, :cond_7

    .line 40
    invoke-virtual {p0, v1, v0, v0}, Lc/k/a/g;->a(Lc/k/a/b;II)V

    goto :goto_2

    .line 41
    :cond_7
    iget p1, p0, Lc/k/a/g;->d:I

    const/16 v0, 0xd

    if-ne p1, v0, :cond_8

    .line 42
    invoke-virtual {p0, v1}, Lc/k/a/g;->a(Lc/k/a/b;)V

    goto :goto_2

    .line 43
    :cond_8
    iget p1, p0, Lc/k/a/g;->d:I

    const/16 v0, 0x9

    if-ne p1, v0, :cond_9

    .line 44
    invoke-virtual {p0, v1}, Lc/k/a/g;->b(Lc/k/a/b;)V

    goto :goto_2

    .line 45
    :cond_9
    iget p1, p0, Lc/k/a/g;->d:I

    const/16 v0, 0xe

    if-ne p1, v0, :cond_a

    .line 46
    invoke-virtual {p0, v1}, Lc/k/a/g;->c(Lc/k/a/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :cond_a
    :goto_2
    invoke-virtual {p0}, Lc/k/a/g;->a()V

    .line 48
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_c

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 49
    :goto_3
    :try_start_1
    sget-boolean v0, Lc/k/a/g;->o:Z

    if-eqz v0, :cond_b

    const-string v0, "ExifInterface"

    const-string v1, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    .line 50
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :cond_b
    invoke-virtual {p0}, Lc/k/a/g;->a()V

    .line 52
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_c

    .line 53
    :goto_4
    invoke-virtual {p0}, Lc/k/a/g;->b()V

    :cond_c
    return-void

    .line 54
    :goto_5
    invoke-virtual {p0}, Lc/k/a/g;->a()V

    .line 55
    sget-boolean v0, Lc/k/a/g;->o:Z

    if-eqz v0, :cond_d

    .line 56
    invoke-virtual {p0}, Lc/k/a/g;->b()V

    .line 57
    :cond_d
    throw p1

    .line 58
    :cond_e
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "inputstream shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a([BI)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 210
    new-instance v0, Lc/k/a/f;

    invoke-direct {v0, p1}, Lc/k/a/f;-><init>([B)V

    .line 211
    invoke-virtual {p0, v0}, Lc/k/a/g;->d(Lc/k/a/b;)V

    .line 212
    invoke-virtual {p0, v0, p2}, Lc/k/a/g;->a(Lc/k/a/f;I)V

    return-void
.end method

.method public final a(Ljava/util/HashMap;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "BitsPerSample"

    .line 336
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    if-eqz v0, :cond_3

    .line 337
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc/k/a/c;->d(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    .line 338
    sget-object v1, Lc/k/a/g;->p:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    .line 339
    :cond_0
    iget v1, p0, Lc/k/a/g;->d:I

    const/4 v3, 0x3

    if-ne v1, v3, :cond_3

    const-string v1, "PhotometricInterpretation"

    .line 340
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    if-eqz p1, :cond_3

    .line 341
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 342
    invoke-virtual {p1, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result p1

    if-ne p1, v2, :cond_1

    .line 343
    sget-object v1, Lc/k/a/g;->q:[I

    .line 344
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    const/4 v1, 0x6

    if-ne p1, v1, :cond_3

    sget-object p1, Lc/k/a/g;->p:[I

    .line 345
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    return v2

    .line 346
    :cond_3
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_4

    const-string p1, "ExifInterface"

    const-string v0, "Unsupported data type value"

    .line 347
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final a([B)Z
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 73
    :try_start_0
    new-instance v2, Lc/k/a/b;

    invoke-direct {v2, p1}, Lc/k/a/b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 74
    :try_start_1
    invoke-virtual {v2}, Lc/k/a/b;->readInt()I

    move-result v1

    int-to-long v3, v1

    const/4 v1, 0x4

    new-array v5, v1, [B

    .line 75
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    .line 76
    sget-object v6, Lc/k/a/g;->s:[B

    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_0

    .line 77
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :cond_0
    const-wide/16 v5, 0x10

    const-wide/16 v7, 0x8

    const-wide/16 v9, 0x1

    cmp-long v11, v3, v9

    if-nez v11, :cond_1

    .line 78
    :try_start_2
    invoke-virtual {v2}, Lc/k/a/b;->readLong()J

    move-result-wide v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    cmp-long v11, v3, v5

    if-gez v11, :cond_2

    .line 79
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :cond_1
    move-wide v5, v7

    .line 80
    :cond_2
    :try_start_3
    array-length v11, p1

    int-to-long v11, v11

    cmp-long v13, v3, v11

    if-lez v13, :cond_3

    .line 81
    array-length p1, p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    int-to-long v3, p1

    :cond_3
    sub-long/2addr v3, v5

    cmp-long p1, v3, v7

    if-gez p1, :cond_4

    .line 82
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :cond_4
    :try_start_4
    new-array p1, v1, [B

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    const-wide/16 v11, 0x4

    .line 83
    div-long v11, v3, v11

    cmp-long v13, v5, v11

    if-gez v13, :cond_a

    .line 84
    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    move-result v11
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eq v11, v1, :cond_5

    .line 85
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :cond_5
    cmp-long v11, v5, v9

    if-nez v11, :cond_6

    goto :goto_2

    .line 86
    :cond_6
    :try_start_5
    sget-object v11, Lc/k/a/g;->t:[B

    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11

    const/4 v12, 0x1

    if-eqz v11, :cond_7

    const/4 v7, 0x1

    goto :goto_1

    .line 87
    :cond_7
    sget-object v11, Lc/k/a/g;->u:[B

    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v11, :cond_8

    const/4 v8, 0x1

    :cond_8
    :goto_1
    if-eqz v7, :cond_9

    if-eqz v8, :cond_9

    .line 88
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v12

    :cond_9
    :goto_2
    add-long/2addr v5, v9

    goto :goto_0

    :cond_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto :goto_4

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_5

    :catch_0
    move-exception p1

    move-object v1, v2

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 89
    :goto_3
    :try_start_6
    sget-boolean v2, Lc/k/a/g;->o:Z

    if-eqz v2, :cond_b

    const-string v2, "ExifInterface"

    const-string v3, "Exception parsing HEIF file type box."

    .line 90
    invoke-static {v2, v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_b
    if-eqz v1, :cond_c

    .line 91
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_c
    :goto_4
    return v0

    :goto_5
    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 92
    :cond_d
    throw p1
.end method

.method public final b(Ljava/lang/String;)Lc/k/a/c;
    .locals 2

    if-eqz p1, :cond_4

    const-string v0, "ISOSpeedRatings"

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_0

    const-string p1, "ExifInterface"

    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 3
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string p1, "PhotographicSensitivity"

    :cond_1
    const/4 v0, 0x0

    .line 4
    :goto_0
    sget-object v1, Lc/k/a/g;->T:[[Lc/k/a/d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 5
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/k/a/c;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1

    .line 6
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "tag shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 7

    const/4 v0, 0x0

    .line 7
    :goto_0
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The size of tag group["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ExifInterface"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 10
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/k/a/c;

    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "tagName: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", tagType: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lc/k/a/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", tagValue: \'"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 12
    invoke-virtual {v4, v3}, Lc/k/a/c;->c(Ljava/nio/ByteOrder;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public final b(Lc/k/a/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27
    sget-boolean v0, Lc/k/a/g;->o:Z

    const-string v1, "ExifInterface"

    if-eqz v0, :cond_0

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRafAttributes starting with: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/16 v0, 0x54

    .line 29
    invoke-virtual {p1, v0}, Lc/k/a/b;->a(I)V

    const/4 v0, 0x4

    new-array v2, v0, [B

    new-array v3, v0, [B

    new-array v0, v0, [B

    .line 30
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    .line 31
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    .line 32
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 33
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 34
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 35
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 36
    new-array v3, v3, [B

    .line 37
    invoke-virtual {p1}, Lc/k/a/b;->c()I

    move-result v4

    sub-int v4, v2, v4

    invoke-virtual {p1, v4}, Lc/k/a/b;->a(I)V

    .line 38
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    .line 39
    new-instance v4, Lc/k/a/b;

    invoke-direct {v4, v3}, Lc/k/a/b;-><init>([B)V

    const/4 v3, 0x5

    .line 40
    invoke-virtual {p0, v4, v2, v3}, Lc/k/a/g;->a(Lc/k/a/b;II)V

    .line 41
    invoke-virtual {p1}, Lc/k/a/b;->c()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1, v0}, Lc/k/a/b;->a(I)V

    .line 42
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 43
    invoke-virtual {p1}, Lc/k/a/b;->readInt()I

    move-result v0

    .line 44
    sget-boolean v2, Lc/k/a/g;->o:Z

    if-eqz v2, :cond_1

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "numberOfDirectoryEntry: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_4

    .line 46
    invoke-virtual {p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v4

    .line 47
    invoke-virtual {p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v5

    .line 48
    sget-object v6, Lc/k/a/g;->O:Lc/k/a/d;

    iget v6, v6, Lc/k/a/d;->a:I

    if-ne v4, v6, :cond_3

    .line 49
    invoke-virtual {p1}, Lc/k/a/b;->readShort()S

    move-result v0

    .line 50
    invoke-virtual {p1}, Lc/k/a/b;->readShort()S

    move-result p1

    .line 51
    iget-object v3, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 52
    invoke-static {v0, v3}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v3

    .line 53
    iget-object v4, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 54
    invoke-static {p1, v4}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v4

    .line 55
    iget-object v5, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v2

    const-string v6, "ImageLength"

    invoke-virtual {v5, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v2, v3, v2

    const-string v3, "ImageWidth"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-boolean v2, Lc/k/a/g;->o:Z

    if-eqz v2, :cond_2

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Updated to length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", width: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void

    .line 59
    :cond_3
    invoke-virtual {p1, v5}, Lc/k/a/b;->a(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final b(Lc/k/a/b;Ljava/util/HashMap;)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "StripOffsets"

    .line 113
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/k/a/c;

    const-string v4, "StripByteCounts"

    .line 114
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/k/a/c;

    if-eqz v3, :cond_b

    if-eqz v2, :cond_b

    .line 115
    iget-object v4, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 116
    invoke-virtual {v3, v4}, Lc/k/a/c;->d(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lc/k/a/j;->a(Ljava/lang/Object;)[J

    move-result-object v3

    .line 117
    iget-object v4, v0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 118
    invoke-virtual {v2, v4}, Lc/k/a/c;->d(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lc/k/a/j;->a(Ljava/lang/Object;)[J

    move-result-object v2

    const-string v4, "ExifInterface"

    if-eqz v3, :cond_a

    .line 119
    array-length v5, v3

    if-nez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz v2, :cond_9

    .line 120
    array-length v5, v2

    if-nez v5, :cond_1

    goto/16 :goto_2

    .line 121
    :cond_1
    array-length v5, v3

    array-length v6, v2

    if-eq v5, v6, :cond_2

    const-string v1, "stripOffsets and stripByteCounts should have same length."

    .line 122
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    const-wide/16 v5, 0x0

    .line 123
    array-length v7, v2

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_3

    aget-wide v10, v2, v9

    add-long/2addr v5, v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_3
    long-to-int v6, v5

    .line 124
    new-array v5, v6, [B

    const/4 v6, 0x1

    .line 125
    iput-boolean v6, v0, Lc/k/a/g;->i:Z

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 126
    :goto_1
    array-length v11, v3

    if-ge v7, v11, :cond_8

    .line 127
    aget-wide v11, v3, v7

    long-to-int v12, v11

    .line 128
    aget-wide v13, v2, v7

    long-to-int v11, v13

    .line 129
    array-length v13, v3

    sub-int/2addr v13, v6

    if-ge v7, v13, :cond_4

    add-int v13, v12, v11

    int-to-long v13, v13

    add-int/lit8 v15, v7, 0x1

    aget-wide v15, v3, v15

    cmp-long v17, v13, v15

    if-eqz v17, :cond_4

    .line 130
    iput-boolean v8, v0, Lc/k/a/g;->i:Z

    :cond_4
    sub-int/2addr v12, v9

    if-gez v12, :cond_5

    const-string v1, "Invalid strip offset value"

    .line 131
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    int-to-long v13, v12

    .line 132
    invoke-virtual {v1, v13, v14}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v15

    const-string v6, " bytes."

    cmp-long v17, v15, v13

    if-eqz v17, :cond_6

    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to skip "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_6
    add-int/2addr v9, v12

    .line 134
    new-array v12, v11, [B

    .line 135
    invoke-virtual {v1, v12}, Ljava/io/InputStream;->read([B)I

    move-result v13

    if-eq v13, v11, :cond_7

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to read "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_7
    add-int/2addr v9, v11

    .line 137
    invoke-static {v12, v8, v5, v10, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v10, v11

    add-int/lit8 v7, v7, 0x1

    const/4 v6, 0x1

    goto :goto_1

    .line 138
    :cond_8
    iget-boolean v1, v0, Lc/k/a/g;->i:Z

    if-eqz v1, :cond_b

    .line 139
    aget-wide v1, v3, v8

    goto :goto_4

    :cond_9
    :goto_2
    const-string v1, "stripByteCounts should not be null or have zero length."

    .line 140
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_a
    :goto_3
    const-string v1, "stripOffsets should not be null or have zero length."

    .line 141
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    :goto_4
    return-void
.end method

.method public final b(Lc/k/a/f;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    invoke-virtual {p0, p1}, Lc/k/a/g;->c(Lc/k/a/f;)V

    .line 61
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v0, 0x1

    aget-object p1, p1, v0

    const-string v1, "MakerNote"

    .line 62
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    if-eqz p1, :cond_6

    .line 63
    new-instance v1, Lc/k/a/f;

    iget-object p1, p1, Lc/k/a/c;->d:[B

    invoke-direct {v1, p1}, Lc/k/a/f;-><init>([B)V

    .line 64
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, p1}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 65
    sget-object p1, Lc/k/a/g;->v:[B

    array-length p1, p1

    new-array p1, p1, [B

    .line 66
    invoke-virtual {v1, p1}, Lc/k/a/b;->readFully([B)V

    const-wide/16 v2, 0x0

    .line 67
    invoke-virtual {v1, v2, v3}, Lc/k/a/f;->g(J)V

    .line 68
    sget-object v2, Lc/k/a/g;->w:[B

    array-length v2, v2

    new-array v2, v2, [B

    .line 69
    invoke-virtual {v1, v2}, Lc/k/a/b;->readFully([B)V

    .line 70
    sget-object v3, Lc/k/a/g;->v:[B

    invoke-static {p1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x8

    .line 71
    invoke-virtual {v1, v2, v3}, Lc/k/a/f;->g(J)V

    goto :goto_0

    .line 72
    :cond_0
    sget-object p1, Lc/k/a/g;->w:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/16 v2, 0xc

    .line 73
    invoke-virtual {v1, v2, v3}, Lc/k/a/f;->g(J)V

    :cond_1
    :goto_0
    const/4 p1, 0x6

    .line 74
    invoke-virtual {p0, v1, p1}, Lc/k/a/g;->a(Lc/k/a/f;I)V

    .line 75
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v1, 0x7

    aget-object p1, p1, v1

    const-string v2, "PreviewImageStart"

    .line 76
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    .line 77
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v2, v1

    const-string v2, "PreviewImageLength"

    .line 78
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/k/a/c;

    if-eqz p1, :cond_2

    if-eqz v1, :cond_2

    .line 79
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    const-string v4, "JPEGInterchangeFormat"

    invoke-virtual {v2, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object p1, p1, v3

    const-string v2, "JPEGInterchangeFormatLength"

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_2
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/16 v1, 0x8

    aget-object p1, p1, v1

    const-string v1, "AspectFrame"

    .line 82
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    if-eqz p1, :cond_6

    .line 83
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Lc/k/a/c;->d(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    if-eqz p1, :cond_5

    .line 84
    array-length v1, p1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x2

    .line 85
    aget v2, p1, v1

    const/4 v3, 0x0

    aget v4, p1, v3

    if-le v2, v4, :cond_6

    const/4 v2, 0x3

    aget v4, p1, v2

    aget v5, p1, v0

    if-le v4, v5, :cond_6

    .line 86
    aget v1, p1, v1

    aget v4, p1, v3

    sub-int/2addr v1, v4

    add-int/2addr v1, v0

    .line 87
    aget v2, p1, v2

    aget p1, p1, v0

    sub-int/2addr v2, p1

    add-int/2addr v2, v0

    if-ge v1, v2, :cond_4

    add-int/2addr v1, v2

    sub-int v2, v1, v2

    sub-int/2addr v1, v2

    .line 88
    :cond_4
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 89
    invoke-static {v1, p1}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object p1

    .line 90
    iget-object v0, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 91
    invoke-static {v2, v0}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v0

    .line 92
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, v3

    const-string v2, "ImageWidth"

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object p1, p1, v3

    const-string v1, "ImageLength"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 94
    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid aspect frame values. frame="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ExifInterface"

    .line 96
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_2
    return-void
.end method

.method public final b(Lc/k/a/f;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    const-string v1, "ImageLength"

    .line 98
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    .line 99
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    const-string v2, "ImageWidth"

    .line 100
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/k/a/c;

    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    .line 101
    :cond_0
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    const-string v1, "JPEGInterchangeFormat"

    .line 102
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    .line 103
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    const-string v2, "JPEGInterchangeFormatLength"

    .line 104
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/k/a/c;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 105
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 106
    invoke-virtual {v0, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v1

    .line 107
    iget-object v2, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 108
    invoke-virtual {v0, v2}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v0

    int-to-long v2, v1

    .line 109
    invoke-virtual {p1, v2, v3}, Lc/k/a/f;->g(J)V

    .line 110
    new-array v0, v0, [B

    .line 111
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 112
    new-instance p1, Lc/k/a/b;

    invoke-direct {p1, v0}, Lc/k/a/b;-><init>([B)V

    invoke-virtual {p0, p1, v1, p2}, Lc/k/a/g;->a(Lc/k/a/b;II)V

    :cond_1
    return-void
.end method

.method public final b(Ljava/util/HashMap;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "ImageLength"

    .line 142
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    const-string v1, "ImageWidth"

    .line 143
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 144
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v0

    .line 145
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result p1

    const/16 v1, 0x200

    if-gt v0, v1, :cond_0

    if-gt p1, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b([B)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 14
    :try_start_0
    new-instance v2, Lc/k/a/b;

    invoke-direct {v2, p1}, Lc/k/a/b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    invoke-virtual {p0, v2}, Lc/k/a/g;->e(Lc/k/a/b;)Ljava/nio/ByteOrder;

    move-result-object p1

    iput-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 16
    invoke-virtual {v2, p1}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 17
    invoke-virtual {v2}, Lc/k/a/b;->readShort()S

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v1, 0x4f52

    if-eq p1, v1, :cond_0

    const/16 v1, 0x5352

    if-ne p1, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 18
    :cond_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 19
    :cond_2
    throw p1

    :catch_1
    nop

    :goto_1
    if-eqz v1, :cond_3

    .line 20
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_3
    return v0
.end method

.method public final c()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x5

    .line 41
    invoke-virtual {p0, v0, v1}, Lc/k/a/g;->a(II)V

    const/4 v2, 0x4

    .line 42
    invoke-virtual {p0, v0, v2}, Lc/k/a/g;->a(II)V

    .line 43
    invoke-virtual {p0, v1, v2}, Lc/k/a/g;->a(II)V

    .line 44
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    const-string v5, "PixelXDimension"

    .line 45
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/k/a/c;

    .line 46
    iget-object v5, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v4, v5, v4

    const-string v5, "PixelYDimension"

    .line 47
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/k/a/c;

    const-string v5, "ImageLength"

    const-string v6, "ImageWidth"

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    .line 48
    iget-object v7, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v0

    invoke-virtual {v7, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v0

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    :cond_0
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 51
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v1

    invoke-virtual {p0, v3}, Lc/k/a/g;->b(Ljava/util/HashMap;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 52
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v4, v3, v1

    aput-object v4, v3, v2

    .line 53
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    aput-object v4, v3, v1

    .line 54
    :cond_1
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v2

    invoke-virtual {p0, v3}, Lc/k/a/g;->b(Ljava/util/HashMap;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "ExifInterface"

    const-string v4, "No image meets the size requirements of a thumbnail image."

    .line 55
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    const-string v3, "Orientation"

    const-string v4, "ThumbnailOrientation"

    .line 56
    invoke-virtual {p0, v0, v4, v3}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    const-string v7, "ThumbnailImageLength"

    .line 57
    invoke-virtual {p0, v0, v7, v5}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    const-string v8, "ThumbnailImageWidth"

    .line 58
    invoke-virtual {p0, v0, v8, v6}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0, v1, v4, v3}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0, v1, v7, v5}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0, v1, v8, v6}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0, v2, v3, v4}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0, v2, v5, v7}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0, v2, v6, v8}, Lc/k/a/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lc/k/a/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19
    sget-boolean v0, Lc/k/a/g;->o:Z

    if-eqz v0, :cond_0

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getWebpAttributes starting with: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 22
    sget-object v0, Lc/k/a/g;->B:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Lc/k/a/b;->a(I)V

    .line 23
    invoke-virtual {p1}, Lc/k/a/b;->readInt()I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    .line 24
    sget-object v1, Lc/k/a/g;->C:[B

    array-length v1, v1

    invoke-virtual {p1, v1}, Lc/k/a/b;->a(I)V

    .line 25
    sget-object v1, Lc/k/a/g;->C:[B

    array-length v1, v1

    add-int/lit8 v1, v1, 0x8

    :goto_0
    const/4 v2, 0x4

    :try_start_0
    new-array v3, v2, [B

    .line 26
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-ne v4, v2, :cond_6

    add-int/2addr v1, v2

    .line 27
    invoke-virtual {p1}, Lc/k/a/b;->readInt()I

    move-result v4

    add-int/2addr v1, v2

    .line 28
    sget-object v2, Lc/k/a/g;->D:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 29
    new-array v0, v4, [B

    .line 30
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result p1

    if-ne p1, v4, :cond_1

    .line 31
    iput v1, p0, Lc/k/a/g;->k:I

    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, v0, p1}, Lc/k/a/g;->a([BI)V

    .line 33
    new-instance p1, Lc/k/a/b;

    invoke-direct {p1, v0}, Lc/k/a/b;-><init>([B)V

    invoke-virtual {p0, p1}, Lc/k/a/g;->f(Lc/k/a/b;)V

    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to read given length for given PNG chunk type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-static {v3}, Lc/k/a/j;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :cond_2
    rem-int/lit8 v2, v4, 0x2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    add-int/lit8 v4, v4, 0x1

    :cond_3
    add-int/2addr v1, v4

    if-ne v1, v0, :cond_4

    :goto_1
    return-void

    :cond_4
    if-gt v1, v0, :cond_5

    .line 37
    invoke-virtual {p1, v4}, Lc/k/a/b;->a(I)V

    goto :goto_0

    .line 38
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Encountered WebP file with invalid chunk size"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 39
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Encountered invalid length while parsing WebP chunktype"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :catch_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Encountered corrupt WebP file."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Lc/k/a/f;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p0, p1}, Lc/k/a/g;->d(Lc/k/a/b;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lc/k/a/g;->a(Lc/k/a/f;I)V

    .line 5
    invoke-virtual {p0, p1, v0}, Lc/k/a/g;->c(Lc/k/a/f;I)V

    const/4 v0, 0x5

    .line 6
    invoke-virtual {p0, p1, v0}, Lc/k/a/g;->c(Lc/k/a/f;I)V

    const/4 v0, 0x4

    .line 7
    invoke-virtual {p0, p1, v0}, Lc/k/a/g;->c(Lc/k/a/f;I)V

    .line 8
    invoke-virtual {p0}, Lc/k/a/g;->c()V

    .line 9
    iget p1, p0, Lc/k/a/g;->d:I

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    .line 10
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v0, 0x1

    aget-object p1, p1, v0

    const-string v1, "MakerNote"

    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    if-eqz p1, :cond_0

    .line 12
    new-instance v1, Lc/k/a/f;

    iget-object p1, p1, Lc/k/a/c;->d:[B

    invoke-direct {v1, p1}, Lc/k/a/f;-><init>([B)V

    .line 13
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, p1}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    const/4 p1, 0x6

    .line 14
    invoke-virtual {v1, p1}, Lc/k/a/b;->a(I)V

    const/16 p1, 0x9

    .line 15
    invoke-virtual {p0, v1, p1}, Lc/k/a/g;->a(Lc/k/a/f;I)V

    .line 16
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object p1, v1, p1

    const-string v1, "ColorSpace"

    .line 17
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    if-eqz p1, :cond_0

    .line 18
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v2, v0

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(Lc/k/a/f;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    const-string v1, "DefaultCropSize"

    .line 66
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    .line 67
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    const-string v2, "SensorTopBorder"

    .line 68
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/k/a/c;

    .line 69
    iget-object v2, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v2, v2, p2

    const-string v3, "SensorLeftBorder"

    .line 70
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/k/a/c;

    .line 71
    iget-object v3, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v3, v3, p2

    const-string v4, "SensorBottomBorder"

    .line 72
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/k/a/c;

    .line 73
    iget-object v4, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v4, v4, p2

    const-string v5, "SensorRightBorder"

    .line 74
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/k/a/c;

    const-string v5, "ImageLength"

    const-string v6, "ImageWidth"

    if-eqz v0, :cond_5

    .line 75
    iget p1, v0, Lc/k/a/c;->a:I

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v7, "Invalid crop size values. cropSize="

    const-string v8, "ExifInterface"

    if-ne p1, v1, :cond_2

    .line 76
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 77
    invoke-virtual {v0, p1}, Lc/k/a/c;->d(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lc/k/a/e;

    if-eqz p1, :cond_1

    .line 78
    array-length v0, p1

    if-eq v0, v4, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    aget-object v0, p1, v3

    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 80
    invoke-static {v0, v1}, Lc/k/a/c;->a(Lc/k/a/e;Ljava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v0

    .line 81
    aget-object p1, p1, v2

    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 82
    invoke-static {p1, v1}, Lc/k/a/c;->a(Lc/k/a/e;Ljava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object p1

    goto :goto_1

    .line 83
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 85
    invoke-static {v8, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 86
    :cond_2
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 87
    invoke-virtual {v0, p1}, Lc/k/a/c;->d(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    if-eqz p1, :cond_4

    .line 88
    array-length v0, p1

    if-eq v0, v4, :cond_3

    goto :goto_2

    .line 89
    :cond_3
    aget v0, p1, v3

    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 90
    invoke-static {v0, v1}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v0

    .line 91
    aget p1, p1, v2

    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 92
    invoke-static {p1, v1}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object p1

    .line 93
    :goto_1
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object p2, v0, p2

    invoke-virtual {p2, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 95
    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 97
    invoke-static {v8, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    if-eqz v1, :cond_6

    if-eqz v2, :cond_6

    if-eqz v3, :cond_6

    if-eqz v4, :cond_6

    .line 98
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, p1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result p1

    .line 99
    iget-object v0, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v0}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v0

    .line 100
    iget-object v1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v1}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v1

    .line 101
    iget-object v3, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v2

    if-le v0, p1, :cond_7

    if-le v1, v2, :cond_7

    sub-int/2addr v0, p1

    sub-int/2addr v1, v2

    .line 102
    iget-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 103
    invoke-static {v0, p1}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object p1

    .line 104
    iget-object v0, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 105
    invoke-static {v1, v0}, Lc/k/a/c;->a(ILjava/nio/ByteOrder;)Lc/k/a/c;

    move-result-object v0

    .line 106
    iget-object v1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    invoke-virtual {v1, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object p1, p1, p2

    invoke-virtual {p1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 108
    :cond_6
    invoke-virtual {p0, p1, p2}, Lc/k/a/g;->b(Lc/k/a/f;I)V

    :cond_7
    :goto_3
    return-void
.end method

.method public final c([B)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    sget-object v2, Lc/k/a/g;->x:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 2
    aget-byte v3, p1, v1

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final d(Lc/k/a/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16
    invoke-virtual {p0, p1}, Lc/k/a/g;->e(Lc/k/a/b;)Ljava/nio/ByteOrder;

    move-result-object v0

    iput-object v0, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 17
    invoke-virtual {p1, v0}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 18
    invoke-virtual {p1}, Lc/k/a/b;->readUnsignedShort()I

    move-result v0

    .line 19
    iget v1, p0, Lc/k/a/g;->d:I

    const/4 v2, 0x7

    if-eq v1, v2, :cond_1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_1

    const/16 v1, 0x2a

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid start code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lc/k/a/b;->readInt()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_3

    add-int/lit8 v0, v0, -0x8

    if-lez v0, :cond_2

    .line 22
    invoke-virtual {p1, v0}, Lc/k/a/b;->a(I)V

    :cond_2
    return-void

    .line 23
    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid first Ifd offset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lc/k/a/f;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    sget-boolean v0, Lc/k/a/g;->o:Z

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getRw2Attributes starting with: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lc/k/a/g;->c(Lc/k/a/f;)V

    .line 7
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const-string v1, "JpgFromRaw"

    .line 8
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    if-eqz p1, :cond_1

    .line 9
    new-instance v1, Lc/k/a/b;

    iget-object v2, p1, Lc/k/a/c;->d:[B

    invoke-direct {v1, v2}, Lc/k/a/b;-><init>([B)V

    .line 10
    iget-wide v2, p1, Lc/k/a/c;->c:J

    long-to-int p1, v2

    const/4 v2, 0x5

    invoke-virtual {p0, v1, p1, v2}, Lc/k/a/g;->a(Lc/k/a/b;II)V

    .line 11
    :cond_1
    iget-object p1, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object p1, p1, v0

    const-string v0, "ISO"

    .line 12
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/k/a/c;

    .line 13
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const-string v2, "PhotographicSensitivity"

    .line 14
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/k/a/c;

    if-eqz p1, :cond_2

    if-nez v0, :cond_2

    .line 15
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    aget-object v0, v0, v1

    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final d([B)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "FUJIFILMCCD-RAW"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 3
    aget-byte v3, p1, v2

    aget-byte v4, v0, v2

    if-eq v3, v4, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Lc/k/a/b;)Ljava/nio/ByteOrder;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    invoke-virtual {p1}, Lc/k/a/b;->readShort()S

    move-result p1

    const/16 v0, 0x4949

    const-string v1, "ExifInterface"

    if-eq p1, v0, :cond_2

    const/16 v0, 0x4d4d

    if-ne p1, v0, :cond_1

    .line 14
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_0

    const-string p1, "readExifSegment: Byte Align MM"

    .line 15
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    :cond_0
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    return-object p1

    .line 17
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid byte order: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_2
    sget-boolean p1, Lc/k/a/g;->o:Z

    if-eqz p1, :cond_3

    const-string p1, "readExifSegment: Byte Align II"

    .line 19
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    :cond_3
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    return-object p1
.end method

.method public final e(Lc/k/a/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lc/k/a/g;->a0:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Lc/k/a/b;->a(I)V

    .line 9
    invoke-virtual {p1}, Lc/k/a/b;->available()I

    move-result v0

    new-array v0, v0, [B

    .line 10
    invoke-virtual {p1, v0}, Lc/k/a/b;->readFully([B)V

    .line 11
    sget-object p1, Lc/k/a/g;->a0:[B

    array-length p1, p1

    iput p1, p0, Lc/k/a/g;->k:I

    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, v0, p1}, Lc/k/a/g;->a([BI)V

    return-void
.end method

.method public final e([B)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    new-instance v2, Lc/k/a/b;

    invoke-direct {v2, p1}, Lc/k/a/b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    invoke-virtual {p0, v2}, Lc/k/a/g;->e(Lc/k/a/b;)Ljava/nio/ByteOrder;

    move-result-object p1

    iput-object p1, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    .line 3
    invoke-virtual {v2, p1}, Lc/k/a/b;->a(Ljava/nio/ByteOrder;)V

    .line 4
    invoke-virtual {v2}, Lc/k/a/b;->readShort()S

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v1, 0x55

    if-ne p1, v1, :cond_0

    const/4 v0, 0x1

    .line 5
    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 6
    :cond_1
    throw p1

    :catch_1
    nop

    :goto_1
    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_2
    return v0
.end method

.method public final f(Lc/k/a/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lc/k/a/g;->f:[Ljava/util/HashMap;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const-string v1, "Compression"

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/k/a/c;

    const/4 v2, 0x6

    if-eqz v1, :cond_2

    .line 7
    iget-object v3, p0, Lc/k/a/g;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v3}, Lc/k/a/c;->b(Ljava/nio/ByteOrder;)I

    move-result v1

    iput v1, p0, Lc/k/a/g;->j:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x7

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, v0}, Lc/k/a/g;->a(Lc/k/a/b;Ljava/util/HashMap;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0, v0}, Lc/k/a/g;->a(Ljava/util/HashMap;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {p0, p1, v0}, Lc/k/a/g;->b(Lc/k/a/b;Ljava/util/HashMap;)V

    goto :goto_0

    .line 11
    :cond_2
    iput v2, p0, Lc/k/a/g;->j:I

    .line 12
    invoke-virtual {p0, p1, v0}, Lc/k/a/g;->a(Lc/k/a/b;Ljava/util/HashMap;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final f([B)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    sget-object v2, Lc/k/a/g;->B:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 2
    aget-byte v3, p1, v1

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 3
    :goto_1
    sget-object v2, Lc/k/a/g;->C:[B

    array-length v3, v2

    if-ge v1, v3, :cond_3

    .line 4
    sget-object v3, Lc/k/a/g;->B:[B

    array-length v3, v3

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, 0x4

    aget-byte v3, p1, v3

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
