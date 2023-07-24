.class public Le/b/a/y/z/i/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "Ljava/nio/ByteBuffer;",
        "Le/b/a/y/z/i/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Le/b/a/y/z/i/a;

.field public static final g:Le/b/a/y/z/i/b;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/z/i/b;

.field public final d:Le/b/a/y/z/i/a;

.field public final e:Le/b/a/y/z/i/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/z/i/a;

    invoke-direct {v0}, Le/b/a/y/z/i/a;-><init>()V

    sput-object v0, Le/b/a/y/z/i/c;->f:Le/b/a/y/z/i/a;

    .line 2
    new-instance v0, Le/b/a/y/z/i/b;

    invoke-direct {v0}, Le/b/a/y/z/i/b;-><init>()V

    sput-object v0, Le/b/a/y/z/i/c;->g:Le/b/a/y/z/i/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Le/b/a/y/x/f1/g;",
            "Le/b/a/y/x/f1/b;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v5, Le/b/a/y/z/i/c;->g:Le/b/a/y/z/i/b;

    sget-object v6, Le/b/a/y/z/i/c;->f:Le/b/a/y/z/i/a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Le/b/a/y/z/i/c;-><init>(Landroid/content/Context;Ljava/util/List;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;Le/b/a/y/z/i/b;Le/b/a/y/z/i/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;Le/b/a/y/z/i/b;Le/b/a/y/z/i/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Le/b/a/y/x/f1/g;",
            "Le/b/a/y/x/f1/b;",
            "Le/b/a/y/z/i/b;",
            "Le/b/a/y/z/i/a;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/z/i/c;->a:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Le/b/a/y/z/i/c;->b:Ljava/util/List;

    .line 5
    iput-object p6, p0, Le/b/a/y/z/i/c;->d:Le/b/a/y/z/i/a;

    .line 6
    new-instance p1, Le/b/a/y/z/i/d;

    invoke-direct {p1, p3, p4}, Le/b/a/y/z/i/d;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;)V

    iput-object p1, p0, Le/b/a/y/z/i/c;->e:Le/b/a/y/z/i/d;

    .line 7
    iput-object p5, p0, Le/b/a/y/z/i/c;->c:Le/b/a/y/z/i/b;

    return-void
.end method

.method public static a(Le/b/a/x/d;II)I
    .locals 4

    .line 32
    invoke-virtual {p0}, Le/b/a/x/d;->a()I

    move-result v0

    div-int/2addr v0, p2

    invoke-virtual {p0}, Le/b/a/x/d;->d()I

    move-result v1

    div-int/2addr v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    .line 34
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v2, 0x2

    const-string v3, "BufferGifDecoder"

    .line 35
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    if-le v0, v1, :cond_1

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Downsampling GIF, sampleSize: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", target dimens: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "x"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "], actual dimens: ["

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    invoke-virtual {p0}, Le/b/a/x/d;->d()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {p0}, Le/b/a/x/d;->a()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 39
    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/i/c;->a(Ljava/nio/ByteBuffer;IILe/b/a/y/r;)Le/b/a/y/z/i/h;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/nio/ByteBuffer;IILe/b/a/x/e;Le/b/a/y/r;)Le/b/a/y/z/i/h;
    .locals 16

    move-object/from16 v1, p0

    const-string v2, "Decoded GIF from stream in "

    const-string v3, "BufferGifDecoder"

    .line 9
    invoke-static {}, Le/b/a/e0/m;->a()J

    move-result-wide v4

    const/4 v6, 0x2

    .line 10
    :try_start_0
    invoke-virtual/range {p4 .. p4}, Le/b/a/x/e;->c()Le/b/a/x/d;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Le/b/a/x/d;->b()I

    move-result v7

    const/4 v8, 0x0

    if-lez v7, :cond_5

    invoke-virtual {v0}, Le/b/a/x/d;->c()I

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_1

    .line 12
    :cond_0
    sget-object v7, Le/b/a/y/z/i/p;->a:Le/b/a/y/q;

    move-object/from16 v9, p5

    invoke-virtual {v9, v7}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Le/b/a/y/b;->c:Le/b/a/y/b;

    if-ne v7, v9, :cond_1

    .line 13
    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    .line 14
    :cond_1
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_0
    move/from16 v13, p2

    move/from16 v14, p3

    .line 15
    invoke-static {v0, v13, v14}, Le/b/a/y/z/i/c;->a(Le/b/a/x/d;II)I

    move-result v9

    .line 16
    iget-object v10, v1, Le/b/a/y/z/i/c;->d:Le/b/a/y/z/i/a;

    iget-object v11, v1, Le/b/a/y/z/i/c;->e:Le/b/a/y/z/i/d;

    move-object/from16 v12, p1

    invoke-virtual {v10, v11, v0, v12, v9}, Le/b/a/y/z/i/a;->a(Le/b/a/x/a;Le/b/a/x/d;Ljava/nio/ByteBuffer;I)Le/b/a/x/b;

    move-result-object v11

    .line 17
    invoke-interface {v11, v7}, Le/b/a/x/b;->a(Landroid/graphics/Bitmap$Config;)V

    .line 18
    invoke-interface {v11}, Le/b/a/x/b;->d()V

    .line 19
    invoke-interface {v11}, Le/b/a/x/b;->c()Landroid/graphics/Bitmap;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v15, :cond_3

    .line 20
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Le/b/a/e0/m;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-object v8

    .line 22
    :cond_3
    :try_start_1
    invoke-static {}, Le/b/a/y/z/d;->a()Le/b/a/y/z/d;

    move-result-object v12

    .line 23
    new-instance v0, Le/b/a/y/z/i/f;

    iget-object v10, v1, Le/b/a/y/z/i/c;->a:Landroid/content/Context;

    move-object v9, v0

    move/from16 v13, p2

    move/from16 v14, p3

    invoke-direct/range {v9 .. v15}, Le/b/a/y/z/i/f;-><init>(Landroid/content/Context;Le/b/a/x/b;Le/b/a/y/v;IILandroid/graphics/Bitmap;)V

    .line 24
    new-instance v7, Le/b/a/y/z/i/h;

    invoke-direct {v7, v0}, Le/b/a/y/z/i/h;-><init>(Le/b/a/y/z/i/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Le/b/a/e0/m;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-object v7

    .line 27
    :cond_5
    :goto_1
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Le/b/a/e0/m;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    return-object v8

    :catchall_0
    move-exception v0

    .line 29
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 30
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Le/b/a/e0/m;->a(J)D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    :cond_7
    throw v0
.end method

.method public a(Ljava/nio/ByteBuffer;IILe/b/a/y/r;)Le/b/a/y/z/i/h;
    .locals 7

    .line 5
    iget-object v0, p0, Le/b/a/y/z/i/c;->c:Le/b/a/y/z/i/b;

    invoke-virtual {v0, p1}, Le/b/a/y/z/i/b;->a(Ljava/nio/ByteBuffer;)Le/b/a/x/e;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, v0

    move-object v6, p4

    .line 6
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Le/b/a/y/z/i/c;->a(Ljava/nio/ByteBuffer;IILe/b/a/x/e;Le/b/a/y/r;)Le/b/a/y/z/i/h;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object p2, p0, Le/b/a/y/z/i/c;->c:Le/b/a/y/z/i/b;

    invoke-virtual {p2, v0}, Le/b/a/y/z/i/b;->a(Le/b/a/x/e;)V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Le/b/a/y/z/i/c;->c:Le/b/a/y/z/i/b;

    invoke-virtual {p2, v0}, Le/b/a/y/z/i/b;->a(Le/b/a/x/e;)V

    .line 8
    throw p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Le/b/a/y/r;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/i/c;->a(Ljava/nio/ByteBuffer;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/nio/ByteBuffer;Le/b/a/y/r;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Le/b/a/y/z/i/p;->b:Le/b/a/y/q;

    invoke-virtual {p2, v0}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Le/b/a/y/z/i/c;->b:Ljava/util/List;

    .line 4
    invoke-static {p2, p1}, Le/b/a/y/m;->a(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
