.class public Le/f/c/l/e/m/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public static final B:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public static final C:Ljava/util/regex/Pattern;

.field public static final D:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:[Ljava/lang/String;

.field public static final x:Ljava/io/FilenameFilter;

.field public static final y:Ljava/io/FilenameFilter;

.field public static final z:Ljava/io/FilenameFilter;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/f/c/l/e/m/i1;

.field public final c:Le/f/c/l/e/m/c1;

.field public final d:Le/f/c/l/e/m/b2;

.field public final e:Le/f/c/l/e/m/o;

.field public final f:Le/f/c/l/e/q/c;

.field public final g:Le/f/c/l/e/m/q1;

.field public final h:Le/f/c/l/e/r/h;

.field public final i:Le/f/c/l/e/m/b;

.field public final j:Le/f/c/l/e/t/c;

.field public final k:Le/f/c/l/e/m/q0;

.field public final l:Le/f/c/l/e/n/e;

.field public final m:Le/f/c/l/e/t/a;

.field public final n:Le/f/c/l/e/t/b;

.field public final o:Le/f/c/l/e/a;

.field public final p:Le/f/c/l/e/w/d;

.field public final q:Ljava/lang/String;

.field public final r:Le/f/c/l/e/k/a;

.field public final s:Le/f/c/l/e/m/z1;

.field public t:Le/f/c/l/e/m/g1;

.field public u:Le/f/a/b/h/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public v:Le/f/a/b/h/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public w:Le/f/a/b/h/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le/f/c/l/e/m/w;

    const-string v1, "BeginSession"

    invoke-direct {v0, v1}, Le/f/c/l/e/m/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Le/f/c/l/e/m/v0;->x:Ljava/io/FilenameFilter;

    .line 2
    invoke-static {}, Le/f/c/l/e/m/p;->a()Ljava/io/FilenameFilter;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/m/v0;->y:Ljava/io/FilenameFilter;

    .line 3
    new-instance v0, Le/f/c/l/e/m/b0;

    invoke-direct {v0}, Le/f/c/l/e/m/b0;-><init>()V

    sput-object v0, Le/f/c/l/e/m/v0;->z:Ljava/io/FilenameFilter;

    .line 4
    new-instance v0, Le/f/c/l/e/m/c0;

    invoke-direct {v0}, Le/f/c/l/e/m/c0;-><init>()V

    sput-object v0, Le/f/c/l/e/m/v0;->A:Ljava/util/Comparator;

    .line 5
    new-instance v0, Le/f/c/l/e/m/d0;

    invoke-direct {v0}, Le/f/c/l/e/m/d0;-><init>()V

    sput-object v0, Le/f/c/l/e/m/v0;->B:Ljava/util/Comparator;

    const-string v0, "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+"

    .line 6
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/m/v0;->C:Ljava/util/regex/Pattern;

    const-string v0, "X-CRASHLYTICS-SEND-FLAGS"

    const-string v1, "1"

    .line 7
    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/m/v0;->D:Ljava/util/Map;

    const-string v0, "SessionUser"

    const-string v1, "SessionApp"

    const-string v2, "SessionOS"

    const-string v3, "SessionDevice"

    .line 8
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/m/v0;->E:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/f/c/l/e/m/o;Le/f/c/l/e/q/c;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/i1;Le/f/c/l/e/r/h;Le/f/c/l/e/m/c1;Le/f/c/l/e/m/b;Le/f/c/l/e/t/a;Le/f/c/l/e/t/c;Le/f/c/l/e/a;Le/f/c/l/e/x/b;Le/f/c/l/e/k/a;Le/f/c/l/e/v/f;)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v3, p6

    move-object/from16 v2, p10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 3
    new-instance v4, Le/f/a/b/h/h;

    invoke-direct {v4}, Le/f/a/b/h/h;-><init>()V

    iput-object v4, v0, Le/f/c/l/e/m/v0;->u:Le/f/a/b/h/h;

    .line 4
    new-instance v4, Le/f/a/b/h/h;

    invoke-direct {v4}, Le/f/a/b/h/h;-><init>()V

    iput-object v4, v0, Le/f/c/l/e/m/v0;->v:Le/f/a/b/h/h;

    .line 5
    new-instance v4, Le/f/a/b/h/h;

    invoke-direct {v4}, Le/f/a/b/h/h;-><init>()V

    iput-object v4, v0, Le/f/c/l/e/m/v0;->w:Le/f/a/b/h/h;

    .line 6
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 7
    iput-object v1, v0, Le/f/c/l/e/m/v0;->a:Landroid/content/Context;

    move-object v4, p2

    .line 8
    iput-object v4, v0, Le/f/c/l/e/m/v0;->e:Le/f/c/l/e/m/o;

    move-object v4, p3

    .line 9
    iput-object v4, v0, Le/f/c/l/e/m/v0;->f:Le/f/c/l/e/q/c;

    move-object v4, p4

    .line 10
    iput-object v4, v0, Le/f/c/l/e/m/v0;->g:Le/f/c/l/e/m/q1;

    move-object/from16 v6, p5

    .line 11
    iput-object v6, v0, Le/f/c/l/e/m/v0;->b:Le/f/c/l/e/m/i1;

    .line 12
    iput-object v3, v0, Le/f/c/l/e/m/v0;->h:Le/f/c/l/e/r/h;

    move-object/from16 v6, p7

    .line 13
    iput-object v6, v0, Le/f/c/l/e/m/v0;->c:Le/f/c/l/e/m/c1;

    move-object/from16 v6, p8

    .line 14
    iput-object v6, v0, Le/f/c/l/e/m/v0;->i:Le/f/c/l/e/m/b;

    if-eqz v2, :cond_0

    .line 15
    iput-object v2, v0, Le/f/c/l/e/m/v0;->j:Le/f/c/l/e/t/c;

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->b()Le/f/c/l/e/t/c;

    move-result-object v2

    iput-object v2, v0, Le/f/c/l/e/m/v0;->j:Le/f/c/l/e/t/c;

    :goto_0
    move-object/from16 v2, p11

    .line 17
    iput-object v2, v0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    .line 18
    invoke-interface/range {p12 .. p12}, Le/f/c/l/e/x/b;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Le/f/c/l/e/m/v0;->q:Ljava/lang/String;

    move-object/from16 v2, p13

    .line 19
    iput-object v2, v0, Le/f/c/l/e/m/v0;->r:Le/f/c/l/e/k/a;

    .line 20
    new-instance v2, Le/f/c/l/e/m/b2;

    invoke-direct {v2}, Le/f/c/l/e/m/b2;-><init>()V

    iput-object v2, v0, Le/f/c/l/e/m/v0;->d:Le/f/c/l/e/m/b2;

    .line 21
    new-instance v2, Le/f/c/l/e/m/q0;

    invoke-direct {v2, v3}, Le/f/c/l/e/m/q0;-><init>(Le/f/c/l/e/r/h;)V

    iput-object v2, v0, Le/f/c/l/e/m/v0;->k:Le/f/c/l/e/m/q0;

    .line 22
    new-instance v2, Le/f/c/l/e/n/e;

    iget-object v7, v0, Le/f/c/l/e/m/v0;->k:Le/f/c/l/e/m/q0;

    invoke-direct {v2, p1, v7}, Le/f/c/l/e/n/e;-><init>(Landroid/content/Context;Le/f/c/l/e/n/c;)V

    iput-object v2, v0, Le/f/c/l/e/m/v0;->l:Le/f/c/l/e/n/e;

    const/4 v2, 0x0

    if-nez p9, :cond_1

    .line 23
    new-instance v7, Le/f/c/l/e/t/a;

    new-instance v8, Le/f/c/l/e/m/r0;

    invoke-direct {v8, p0, v2}, Le/f/c/l/e/m/r0;-><init>(Le/f/c/l/e/m/v0;Le/f/c/l/e/m/w;)V

    invoke-direct {v7, v8}, Le/f/c/l/e/t/a;-><init>(Le/f/c/l/e/t/d;)V

    goto :goto_1

    :cond_1
    move-object/from16 v7, p9

    .line 24
    :goto_1
    iput-object v7, v0, Le/f/c/l/e/m/v0;->m:Le/f/c/l/e/t/a;

    .line 25
    new-instance v7, Le/f/c/l/e/m/s0;

    invoke-direct {v7, p0, v2}, Le/f/c/l/e/m/s0;-><init>(Le/f/c/l/e/m/v0;Le/f/c/l/e/m/w;)V

    iput-object v7, v0, Le/f/c/l/e/m/v0;->n:Le/f/c/l/e/t/b;

    .line 26
    new-instance v7, Le/f/c/l/e/w/a;

    const/16 v2, 0x400

    const/4 v8, 0x1

    new-array v8, v8, [Le/f/c/l/e/w/d;

    new-instance v9, Le/f/c/l/e/w/c;

    const/16 v10, 0xa

    invoke-direct {v9, v10}, Le/f/c/l/e/w/c;-><init>(I)V

    aput-object v9, v8, v5

    invoke-direct {v7, v2, v8}, Le/f/c/l/e/w/a;-><init>(I[Le/f/c/l/e/w/d;)V

    iput-object v7, v0, Le/f/c/l/e/m/v0;->p:Le/f/c/l/e/w/d;

    .line 27
    iget-object v5, v0, Le/f/c/l/e/m/v0;->l:Le/f/c/l/e/n/e;

    iget-object v8, v0, Le/f/c/l/e/m/v0;->d:Le/f/c/l/e/m/b2;

    move-object v1, p1

    move-object v2, p4

    move-object/from16 v3, p6

    move-object/from16 v4, p8

    move-object v6, v8

    move-object/from16 v8, p14

    .line 28
    invoke-static/range {v1 .. v8}, Le/f/c/l/e/m/z1;->a(Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/r/h;Le/f/c/l/e/m/b;Le/f/c/l/e/n/e;Le/f/c/l/e/m/b2;Le/f/c/l/e/w/d;Le/f/c/l/e/v/f;)Le/f/c/l/e/m/z1;

    move-result-object v1

    iput-object v1, v0, Le/f/c/l/e/m/v0;->s:Le/f/c/l/e/m/z1;

    return-void
.end method

.method public static synthetic a(Ljava/util/Date;)J
    .locals 2

    .line 6
    invoke-static {p0}, Le/f/c/l/e/m/v0;->b(Ljava/util/Date;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic a(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/t/h/c;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/t/h/c;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 2

    .line 29
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/16 v1, 0x23

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/f/c/l/e/f;Ljava/lang/String;Landroid/content/Context;Ljava/io/File;[B)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/f;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "[B)",
            "Ljava/util/List<",
            "Le/f/c/l/e/m/u1;",
            ">;"
        }
    .end annotation

    .line 244
    new-instance v0, Le/f/c/l/e/m/t1;

    invoke-direct {v0, p3}, Le/f/c/l/e/m/t1;-><init>(Ljava/io/File;)V

    .line 245
    invoke-virtual {v0, p1}, Le/f/c/l/e/m/t1;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object p3

    .line 246
    invoke-virtual {v0, p1}, Le/f/c/l/e/m/t1;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 247
    :try_start_0
    invoke-interface {p0}, Le/f/c/l/e/f;->e()Ljava/io/File;

    move-result-object v0

    invoke-static {v0, p2}, Le/f/c/l/e/p/c;->a(Ljava/io/File;Landroid/content/Context;)[B

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p2, 0x0

    .line 248
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 249
    new-instance v1, Le/f/c/l/e/m/f;

    const-string v2, "logs_file"

    const-string v3, "logs"

    invoke-direct {v1, v2, v3, p4}, Le/f/c/l/e/m/f;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    new-instance p4, Le/f/c/l/e/m/f;

    const-string v1, "binary_images_file"

    const-string v2, "binaryImages"

    invoke-direct {p4, v1, v2, p2}, Le/f/c/l/e/m/f;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    new-instance p2, Le/f/c/l/e/m/p1;

    .line 252
    invoke-interface {p0}, Le/f/c/l/e/f;->f()Ljava/io/File;

    move-result-object p4

    const-string v1, "crash_meta_file"

    const-string v2, "metadata"

    invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    .line 253
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    new-instance p2, Le/f/c/l/e/m/p1;

    .line 255
    invoke-interface {p0}, Le/f/c/l/e/f;->d()Ljava/io/File;

    move-result-object p4

    const-string v1, "session_meta_file"

    const-string v2, "session"

    invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    .line 256
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    new-instance p2, Le/f/c/l/e/m/p1;

    .line 258
    invoke-interface {p0}, Le/f/c/l/e/f;->a()Ljava/io/File;

    move-result-object p4

    const-string v1, "app_meta_file"

    const-string v2, "app"

    invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    .line 259
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    new-instance p2, Le/f/c/l/e/m/p1;

    .line 261
    invoke-interface {p0}, Le/f/c/l/e/f;->g()Ljava/io/File;

    move-result-object p4

    const-string v1, "device_meta_file"

    const-string v2, "device"

    invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    .line 262
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    new-instance p2, Le/f/c/l/e/m/p1;

    .line 264
    invoke-interface {p0}, Le/f/c/l/e/f;->b()Ljava/io/File;

    move-result-object p4

    const-string v1, "os_meta_file"

    const-string v2, "os"

    invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    .line 265
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    new-instance p2, Le/f/c/l/e/m/p1;

    .line 267
    invoke-interface {p0}, Le/f/c/l/e/f;->c()Ljava/io/File;

    move-result-object p0

    const-string p4, "minidump_file"

    const-string v1, "minidump"

    invoke-direct {p2, p4, v1, p0}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    .line 268
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    new-instance p0, Le/f/c/l/e/m/p1;

    const-string p2, "user_meta_file"

    const-string p4, "user"

    invoke-direct {p0, p2, p4, p3}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    new-instance p0, Le/f/c/l/e/m/p1;

    const-string p2, "keys_file"

    const-string p3, "keys"

    invoke-direct {p0, p2, p3, p1}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static synthetic a(Le/f/c/l/e/m/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->d()V

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/m/v0;J)V
    .locals 0

    .line 8
    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/v0;->a(J)V

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/m/v0;Le/f/c/l/e/v/j/b;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/v/j/b;Z)V

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/m/v0;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;J)V
    .locals 0

    .line 7
    invoke-virtual/range {p0 .. p5}, Le/f/c/l/e/m/v0;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;J)V

    return-void
.end method

.method public static a(Le/f/c/l/e/s/e;Ljava/io/File;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "Failed to close file input stream."

    .line 222
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 223
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Tried to include a file that doesn\'t exist: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 224
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 225
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v3

    long-to-int p1, v3

    invoke-static {v2, p0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/InputStream;Le/f/c/l/e/s/e;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    invoke-static {v2, v0}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p0

    move-object v1, v2

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    invoke-static {v1, v0}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 227
    throw p0
.end method

.method public static a(Le/f/c/l/e/s/e;[Ljava/io/File;Ljava/lang/String;)V
    .locals 10

    .line 207
    sget-object v0, Le/f/c/l/e/m/j;->c:Ljava/util/Comparator;

    invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 208
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    .line 209
    :try_start_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Found Non Fatal for session ID %s in %s "

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object p2, v7, v1

    .line 210
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    .line 211
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 212
    invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 213
    invoke-static {p0, v3}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    .line 214
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    const-string v5, "Error writting non-fatal to session."

    invoke-virtual {v4, v5, v3}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(Ljava/io/File;Le/f/c/l/e/m/n0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "Failed to close "

    const-string v1, "Failed to flush to append to "

    const/4 v2, 0x0

    .line 126
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 127
    :try_start_1
    invoke-static {v3}, Le/f/c/l/e/s/e;->a(Ljava/io/OutputStream;)Le/f/c/l/e/s/e;

    move-result-object v2

    .line 128
    invoke-interface {p1, v2}, Le/f/c/l/e/m/n0;->a(Le/f/c/l/e/s/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 130
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v3, v2

    .line 131
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 133
    throw p1
.end method

.method public static a(Ljava/io/InputStream;Le/f/c/l/e/s/e;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 228
    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    sub-int v2, p2, v1

    .line 229
    invoke-virtual {p0, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-ltz v2, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    .line 230
    :cond_0
    invoke-virtual {p1, v0}, Le/f/c/l/e/s/e;->a([B)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/io/File;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    invoke-static {p0, p1}, Le/f/c/l/e/m/v0;->b(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    const-string p0, ".ae"

    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Le/f/c/l/e/m/v0;Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/io/File;Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 0

    .line 55
    invoke-virtual {p0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Le/f/c/l/e/m/v0;->d([Ljava/io/File;)[Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/util/Date;)J
    .locals 4

    .line 12
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static synthetic b(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/i1;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->b:Le/f/c/l/e/m/i1;

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    .line 13
    :cond_0
    new-instance v0, Le/f/c/l/e/m/z;

    invoke-direct {v0, p0}, Le/f/c/l/e/m/z;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Le/f/c/l/e/m/n0;)V

    return-void
.end method

.method public static synthetic b([Ljava/io/File;)V
    .locals 0

    .line 2
    invoke-static {p0}, Le/f/c/l/e/m/v0;->c([Ljava/io/File;)V

    return-void
.end method

.method public static synthetic c(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/o;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->e:Le/f/c/l/e/m/o;

    return-object p0
.end method

.method public static c([Ljava/io/File;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 16
    :cond_0
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    .line 17
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic d(Le/f/c/l/e/m/v0;)Le/f/a/b/h/g;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->q()Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static d([Ljava/io/File;)[Ljava/io/File;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/io/File;

    :cond_0
    return-object p0
.end method

.method public static synthetic e(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/a;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->m:Le/f/c/l/e/t/a;

    return-object p0
.end method

.method public static synthetic f(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/c;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->j:Le/f/c/l/e/t/c;

    return-object p0
.end method

.method public static synthetic g(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/b;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->i:Le/f/c/l/e/m/b;

    return-object p0
.end method

.method public static synthetic h(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/b;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->n:Le/f/c/l/e/t/b;

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p0}, Le/f/c/l/e/m/v0;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Le/f/c/l/e/m/v0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->q:Ljava/lang/String;

    return-object p0
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "-"

    const-string v1, ""

    .line 2
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Le/f/c/l/e/m/v0;)Le/f/c/l/e/k/a;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->r:Le/f/c/l/e/k/a;

    return-object p0
.end method

.method public static synthetic k(Le/f/c/l/e/m/v0;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->f()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/c1;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->c:Le/f/c/l/e/m/c1;

    return-object p0
.end method

.method public static synthetic m(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/z1;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/v0;->s:Le/f/c/l/e/m/z1;

    return-object p0
.end method

.method public static synthetic t()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/m/v0;->C:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public static u()Z
    .locals 1

    :try_start_0
    const-string v0, "com.google.firebase.crash.FirebaseCrash"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static v()J
    .locals 2

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Le/f/c/l/e/m/v0;->b(Ljava/util/Date;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(FLe/f/a/b/h/g;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Le/f/a/b/h/g<",
            "Le/f/c/l/e/v/j/b;",
            ">;)",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Le/f/c/l/e/m/v0;->m:Le/f/c/l/e/t/a;

    invoke-virtual {v0}, Le/f/c/l/e/t/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "No reports are available."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 24
    iget-object p1, p0, Le/f/c/l/e/m/v0;->u:Le/f/a/b/h/h;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 25
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 26
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Unsent reports are available."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->s()Le/f/a/b/h/g;

    move-result-object v0

    new-instance v1, Le/f/c/l/e/m/k0;

    invoke-direct {v1, p0, p2, p1}, Le/f/c/l/e/m/k0;-><init>(Le/f/c/l/e/m/v0;Le/f/a/b/h/g;F)V

    .line 28
    invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/t/h/c;
    .locals 4

    .line 231
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.crashlytics.ApiEndpoint"

    .line 232
    invoke-static {v0, v1}, Le/f/c/l/e/m/j;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 233
    new-instance v1, Le/f/c/l/e/t/h/d;

    iget-object v2, p0, Le/f/c/l/e/m/v0;->f:Le/f/c/l/e/q/c;

    .line 234
    invoke-static {}, Le/f/c/l/e/m/b1;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v0, p1, v2, v3}, Le/f/c/l/e/t/h/d;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Ljava/lang/String;)V

    .line 235
    new-instance p1, Le/f/c/l/e/t/h/e;

    iget-object v2, p0, Le/f/c/l/e/m/v0;->f:Le/f/c/l/e/q/c;

    .line 236
    invoke-static {}, Le/f/c/l/e/m/b1;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v0, p2, v2, v3}, Le/f/c/l/e/t/h/e;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Ljava/lang/String;)V

    .line 237
    new-instance p2, Le/f/c/l/e/t/h/b;

    invoke-direct {p2, v1, p1}, Le/f/c/l/e/t/h/b;-><init>(Le/f/c/l/e/t/h/d;Le/f/c/l/e/t/h/e;)V

    return-object p2
.end method

.method public a()V
    .locals 2

    .line 76
    iget-object v0, p0, Le/f/c/l/e/m/v0;->e:Le/f/c/l/e/m/o;

    new-instance v1, Le/f/c/l/e/m/r;

    invoke-direct {v1, p0}, Le/f/c/l/e/m/r;-><init>(Le/f/c/l/e/m/v0;)V

    invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->a(Ljava/lang/Runnable;)Le/f/a/b/h/g;

    return-void
.end method

.method public a(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/m/v0;->a(IZ)V

    return-void
.end method

.method public final a(IZ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    add-int/lit8 v0, p2, 0x8

    .line 31
    invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->c(I)V

    .line 32
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->p()[Ljava/io/File;

    move-result-object v0

    .line 33
    array-length v1, v0

    if-gt v1, p2, :cond_0

    .line 34
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "No open sessions to be closed."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return-void

    .line 35
    :cond_0
    aget-object v1, v0, p2

    .line 36
    invoke-static {v1}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-virtual {p0, v1}, Le/f/c/l/e/m/v0;->g(Ljava/lang/String;)V

    .line 38
    iget-object v2, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    invoke-interface {v2, v1}, Le/f/c/l/e/a;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 39
    invoke-virtual {p0, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;)V

    .line 40
    iget-object v2, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    invoke-interface {v2, v1}, Le/f/c/l/e/a;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 41
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not finalize native session: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 42
    :cond_1
    invoke-virtual {p0, v0, p2, p1}, Le/f/c/l/e/m/v0;->a([Ljava/io/File;II)V

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    const/4 p1, 0x0

    .line 43
    aget-object p1, v0, p1

    .line 44
    invoke-static {p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Le/f/c/l/e/m/v0;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 45
    :cond_2
    iget-object p2, p0, Le/f/c/l/e/m/v0;->s:Le/f/c/l/e/m/z1;

    invoke-static {}, Le/f/c/l/e/m/v0;->v()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1, p1}, Le/f/c/l/e/m/z1;->a(JLjava/lang/String;)V

    return-void
.end method

.method public final a(J)V
    .locals 4

    .line 116
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ".ae"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 117
    :catch_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "Could not write app exception marker."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final a(Le/f/c/l/e/s/c;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 52
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Le/f/c/l/e/s/c;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 53
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Error closing session file stream in the presence of an exception"

    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final a(Le/f/c/l/e/s/e;Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 215
    sget-object v0, Le/f/c/l/e/m/v0;->E:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 216
    new-instance v5, Le/f/c/l/e/m/o0;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".cls"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V

    .line 217
    invoke-virtual {p0, v5}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v5

    .line 218
    array-length v6, v5

    const-string v7, " data for session ID "

    if-nez v6, :cond_0

    .line 219
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Can\'t find "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 220
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Collecting "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 221
    aget-object v4, v5, v2

    invoke-static {p1, v4}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/io/File;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a(Le/f/c/l/e/s/e;Ljava/lang/Thread;Ljava/lang/Throwable;JLjava/lang/String;Z)V
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 138
    new-instance v5, Le/f/c/l/e/w/e;

    iget-object v1, v0, Le/f/c/l/e/m/v0;->p:Le/f/c/l/e/w/d;

    move-object/from16 v2, p3

    invoke-direct {v5, v2, v1}, Le/f/c/l/e/w/e;-><init>(Ljava/lang/Throwable;Le/f/c/l/e/w/d;)V

    .line 139
    invoke-virtual/range {p0 .. p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;

    move-result-object v1

    .line 140
    invoke-static {v1}, Le/f/c/l/e/m/e;->a(Landroid/content/Context;)Le/f/c/l/e/m/e;

    move-result-object v2

    .line 141
    invoke-virtual {v2}, Le/f/c/l/e/m/e;->a()Ljava/lang/Float;

    move-result-object v17

    .line 142
    invoke-virtual {v2}, Le/f/c/l/e/m/e;->b()I

    move-result v18

    .line 143
    invoke-static {v1}, Le/f/c/l/e/m/j;->f(Landroid/content/Context;)Z

    move-result v19

    .line 144
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v14, v2, Landroid/content/res/Configuration;->orientation:I

    .line 145
    invoke-static {}, Le/f/c/l/e/m/j;->b()J

    move-result-wide v2

    invoke-static {v1}, Le/f/c/l/e/m/j;->a(Landroid/content/Context;)J

    move-result-wide v6

    sub-long v20, v2, v6

    .line 146
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Le/f/c/l/e/m/j;->a(Ljava/lang/String;)J

    move-result-wide v22

    .line 147
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Le/f/c/l/e/m/j;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v13

    .line 148
    new-instance v9, Ljava/util/LinkedList;

    invoke-direct {v9}, Ljava/util/LinkedList;-><init>()V

    .line 149
    iget-object v7, v5, Le/f/c/l/e/w/e;->c:[Ljava/lang/StackTraceElement;

    .line 150
    iget-object v2, v0, Le/f/c/l/e/m/v0;->i:Le/f/c/l/e/m/b;

    iget-object v15, v2, Le/f/c/l/e/m/b;->b:Ljava/lang/String;

    .line 151
    iget-object v2, v0, Le/f/c/l/e/m/v0;->g:Le/f/c/l/e/m/q1;

    invoke-virtual {v2}, Le/f/c/l/e/m/q1;->b()Ljava/lang/String;

    move-result-object v16

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p7, :cond_1

    .line 152
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object v4

    .line 153
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v6

    new-array v6, v6, [Ljava/lang/Thread;

    .line 154
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 155
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Thread;

    aput-object v10, v6, v2

    .line 156
    iget-object v10, v0, Le/f/c/l/e/m/v0;->p:Le/f/c/l/e/w/d;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/StackTraceElement;

    invoke-interface {v10, v8}, Le/f/c/l/e/w/d;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    move-result-object v8

    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    move-object v8, v6

    goto :goto_1

    :cond_1
    new-array v2, v2, [Ljava/lang/Thread;

    move-object v8, v2

    :goto_1
    const-string v2, "com.crashlytics.CollectCustomKeys"

    .line 157
    invoke-static {v1, v2, v3}, Le/f/c/l/e/m/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_2

    .line 158
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    goto :goto_2

    .line 159
    :cond_2
    iget-object v1, v0, Le/f/c/l/e/m/v0;->d:Le/f/c/l/e/m/b2;

    invoke-virtual {v1}, Le/f/c/l/e/m/b2;->a()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 160
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    if-le v2, v3, :cond_3

    .line 161
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    move-object v11, v2

    goto :goto_3

    :cond_3
    :goto_2
    move-object v11, v1

    :goto_3
    const/16 v10, 0x8

    .line 162
    iget-object v1, v0, Le/f/c/l/e/m/v0;->l:Le/f/c/l/e/n/e;

    .line 163
    invoke-virtual {v1}, Le/f/c/l/e/n/e;->b()[B

    move-result-object v12

    move-object/from16 v1, p1

    move-wide/from16 v2, p4

    move-object/from16 v4, p6

    move-object/from16 v6, p2

    move-object/from16 v24, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v24

    .line 164
    invoke-static/range {v1 .. v23}, Le/f/c/l/e/s/f;->a(Le/f/c/l/e/s/e;JLjava/lang/String;Le/f/c/l/e/w/e;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;[Ljava/lang/Thread;Ljava/util/List;ILjava/util/Map;[BLandroid/app/ActivityManager$RunningAppProcessInfo;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Float;IZJJ)V

    .line 165
    iget-object v1, v0, Le/f/c/l/e/m/v0;->l:Le/f/c/l/e/n/e;

    invoke-virtual {v1}, Le/f/c/l/e/n/e;->a()V

    return-void
.end method

.method public declared-synchronized a(Le/f/c/l/e/v/f;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    monitor-enter p0

    .line 14
    :try_start_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics is handling uncaught exception \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\" from thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 17
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 18
    iget-object v0, p0, Le/f/c/l/e/m/v0;->e:Le/f/c/l/e/m/o;

    new-instance v1, Le/f/c/l/e/m/g0;

    move-object v2, v1

    move-object v3, p0

    move-object v5, p3

    move-object v6, p2

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Le/f/c/l/e/m/g0;-><init>(Le/f/c/l/e/m/v0;Ljava/util/Date;Ljava/lang/Throwable;Ljava/lang/Thread;Le/f/c/l/e/v/f;)V

    .line 19
    invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->c(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-static {p1}, Le/f/c/l/e/m/h2;->a(Le/f/a/b/h/g;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :catch_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Le/f/c/l/e/v/j/b;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 238
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;

    move-result-object v0

    .line 239
    iget-object v1, p0, Le/f/c/l/e/m/v0;->j:Le/f/c/l/e/t/c;

    invoke-interface {v1, p1}, Le/f/c/l/e/t/c;->a(Le/f/c/l/e/v/j/b;)Le/f/c/l/e/t/f;

    move-result-object v1

    .line 240
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->m()[Ljava/io/File;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 241
    iget-object v6, p1, Le/f/c/l/e/v/j/b;->e:Ljava/lang/String;

    invoke-static {v6, v5}, Le/f/c/l/e/m/v0;->b(Ljava/lang/String;Ljava/io/File;)V

    .line 242
    new-instance v6, Le/f/c/l/e/t/g/e;

    sget-object v7, Le/f/c/l/e/m/v0;->D:Ljava/util/Map;

    invoke-direct {v6, v5, v7}, Le/f/c/l/e/t/g/e;-><init>(Ljava/io/File;Ljava/util/Map;)V

    .line 243
    iget-object v5, p0, Le/f/c/l/e/m/v0;->e:Le/f/c/l/e/m/o;

    new-instance v7, Le/f/c/l/e/m/t0;

    invoke-direct {v7, v0, v6, v1, p2}, Le/f/c/l/e/m/t0;-><init>(Landroid/content/Context;Le/f/c/l/e/t/g/d;Le/f/c/l/e/t/f;Z)V

    invoke-virtual {v5, v7}, Le/f/c/l/e/m/o;->a(Ljava/lang/Runnable;)Le/f/a/b/h/g;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Ljava/io/File;Ljava/lang/String;I)V
    .locals 10

    .line 166
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Collecting session parts for ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 167
    new-instance v0, Le/f/c/l/e/m/o0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "SessionCrash"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 169
    array-length v3, v0

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 170
    :goto_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Object;

    aput-object p2, v7, v2

    .line 171
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v7, v1

    const-string v8, "Session %s has fatal exception: %s"

    invoke-static {v5, v8, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 172
    new-instance v4, Le/f/c/l/e/m/o0;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "SessionEvent"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V

    .line 173
    invoke-virtual {p0, v4}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 174
    array-length v5, v4

    if-lez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 175
    :goto_1
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p2, v6, v2

    .line 176
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    aput-object v9, v6, v1

    const-string v1, "Session %s has non-fatal exceptions: %s"

    .line 177
    invoke-static {v8, v1, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-virtual {v7, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    if-nez v3, :cond_3

    if-eqz v5, :cond_2

    goto :goto_2

    .line 179
    :cond_2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No events present for session ID "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    goto :goto_4

    .line 180
    :cond_3
    :goto_2
    invoke-virtual {p0, p2, v4, p3}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;[Ljava/io/File;I)[Ljava/io/File;

    move-result-object p3

    if-eqz v3, :cond_4

    .line 181
    aget-object v0, v0, v2

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    .line 182
    :goto_3
    invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/lang/String;[Ljava/io/File;Ljava/io/File;)V

    .line 183
    :goto_4
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Removing session part files for ID "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 184
    invoke-virtual {p0, p2}, Le/f/c/l/e/m/v0;->c(Ljava/lang/String;)[Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Le/f/c/l/e/m/v0;->c([Ljava/io/File;)V

    return-void
.end method

.method public final a(Ljava/io/File;Ljava/lang/String;[Ljava/io/File;Ljava/io/File;)V
    .locals 9

    const-string v0, "Failed to close CLS file"

    const-string v1, "Error flushing session file stream"

    const/4 v2, 0x1

    if-eqz p4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 185
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->g()Ljava/io/File;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->j()Ljava/io/File;

    move-result-object v4

    .line 186
    :goto_1
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_2

    .line 187
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    :cond_2
    const/4 v5, 0x0

    .line 188
    :try_start_0
    new-instance v6, Le/f/c/l/e/s/c;

    invoke-direct {v6, v4, p2}, Le/f/c/l/e/s/c;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    :try_start_1
    invoke-static {v6}, Le/f/c/l/e/s/e;->a(Ljava/io/OutputStream;)Le/f/c/l/e/s/e;

    move-result-object v5

    .line 190
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Collecting SessionStart data for session ID "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 191
    invoke-static {v5, p1}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/io/File;)V

    const/4 p1, 0x4

    .line 192
    invoke-static {}, Le/f/c/l/e/m/v0;->v()J

    move-result-wide v7

    invoke-virtual {v5, p1, v7, v8}, Le/f/c/l/e/s/e;->a(IJ)V

    const/4 p1, 0x5

    .line 193
    invoke-virtual {v5, p1, v3}, Le/f/c/l/e/s/e;->a(IZ)V

    const/16 p1, 0xb

    .line 194
    invoke-virtual {v5, p1, v2}, Le/f/c/l/e/s/e;->d(II)V

    const/16 p1, 0xc

    const/4 v2, 0x3

    .line 195
    invoke-virtual {v5, p1, v2}, Le/f/c/l/e/s/e;->a(II)V

    .line 196
    invoke-virtual {p0, v5, p2}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/lang/String;)V

    .line 197
    invoke-static {v5, p3, p2}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;[Ljava/io/File;Ljava/lang/String;)V

    if-eqz v3, :cond_3

    .line 198
    invoke-static {v5, p4}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 199
    :cond_3
    invoke-static {v5, v1}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 200
    invoke-static {v6, v0}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v6, v5

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v6, v5

    .line 201
    :goto_2
    :try_start_2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to write session file for session ID: "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 202
    invoke-static {v5, v1}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 203
    invoke-virtual {p0, v6}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/c;)V

    :goto_3
    return-void

    :catchall_1
    move-exception p1

    .line 204
    :goto_4
    invoke-static {v5, v1}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 205
    invoke-static {v6, v0}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 206
    throw p1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 6

    .line 86
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Finalizing native report for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    .line 88
    invoke-interface {v0, p1}, Le/f/c/l/e/a;->c(Ljava/lang/String;)Le/f/c/l/e/f;

    move-result-object v0

    .line 89
    invoke-interface {v0}, Le/f/c/l/e/f;->c()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 90
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    .line 92
    new-instance v3, Le/f/c/l/e/n/e;

    iget-object v4, p0, Le/f/c/l/e/m/v0;->a:Landroid/content/Context;

    iget-object v5, p0, Le/f/c/l/e/m/v0;->k:Le/f/c/l/e/m/q0;

    invoke-direct {v3, v4, v5, p1}, Le/f/c/l/e/n/e;-><init>(Landroid/content/Context;Le/f/c/l/e/n/c;Ljava/lang/String;)V

    .line 93
    new-instance v4, Ljava/io/File;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->i()Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 94
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v5

    if-nez v5, :cond_1

    .line 95
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v0, "Couldn\'t create native sessions directory"

    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return-void

    .line 96
    :cond_1
    invoke-virtual {p0, v1, v2}, Le/f/c/l/e/m/v0;->a(J)V

    .line 97
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;

    move-result-object v1

    .line 98
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v2

    .line 99
    invoke-virtual {v3}, Le/f/c/l/e/n/e;->b()[B

    move-result-object v5

    .line 100
    invoke-static {v0, p1, v1, v2, v5}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/f;Ljava/lang/String;Landroid/content/Context;Ljava/io/File;[B)Ljava/util/List;

    move-result-object v0

    .line 101
    invoke-static {v4, v0}, Le/f/c/l/e/m/v1;->a(Ljava/io/File;Ljava/util/List;)V

    .line 102
    iget-object v1, p0, Le/f/c/l/e/m/v0;->s:Le/f/c/l/e/m/z1;

    .line 103
    invoke-static {p1}, Le/f/c/l/e/m/v0;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 104
    invoke-virtual {v1, p1, v0}, Le/f/c/l/e/m/z1;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 105
    invoke-virtual {v3}, Le/f/c/l/e/n/e;->a()V

    return-void

    .line 106
    :cond_2
    :goto_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No minidump data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 3

    .line 56
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v0

    new-instance v1, Le/f/c/l/e/m/o0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "SessionEvent"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V

    sget-object p1, Le/f/c/l/e/m/v0;->B:Ljava/util/Comparator;

    .line 57
    invoke-static {v0, v1, p2, p1}, Le/f/c/l/e/m/h2;->a(Ljava/io/File;Ljava/io/FilenameFilter;ILjava/util/Comparator;)I

    return-void
.end method

.method public final a(Ljava/lang/String;J)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 134
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 135
    invoke-static {}, Le/f/c/l/e/m/b1;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Crashlytics Android SDK/%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 136
    new-instance v1, Le/f/c/l/e/m/t;

    move-object v3, v1

    move-object v4, p0

    move-object v5, p1

    move-object v6, v0

    move-wide v7, p2

    invoke-direct/range {v3 .. v8}, Le/f/c/l/e/m/t;-><init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;J)V

    const-string v2, "BeginSession"

    invoke-virtual {p0, p1, v2, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V

    .line 137
    iget-object v1, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    invoke-interface {v1, p1, v0, p2, p3}, Le/f/c/l/e/a;->a(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "Failed to close session "

    const-string v1, "Failed to flush to session "

    const-string v2, " file."

    const/4 v3, 0x0

    .line 118
    :try_start_0
    new-instance v4, Le/f/c/l/e/s/c;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v5, p1}, Le/f/c/l/e/s/c;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 119
    :try_start_1
    invoke-static {v4}, Le/f/c/l/e/s/e;->a(Ljava/io/OutputStream;)Le/f/c/l/e/s/e;

    move-result-object v3

    .line 120
    invoke-interface {p3, v3}, Le/f/c/l/e/m/n0;->a(Le/f/c/l/e/s/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 122
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v4, v3

    .line 123
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v3, p3}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 124
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v4, p2}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 125
    throw p1
.end method

.method public a(Ljava/lang/Thread$UncaughtExceptionHandler;Le/f/c/l/e/v/f;)V
    .locals 2

    .line 10
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->r()V

    .line 11
    new-instance v0, Le/f/c/l/e/m/e0;

    invoke-direct {v0, p0}, Le/f/c/l/e/m/e0;-><init>(Le/f/c/l/e/m/v0;)V

    .line 12
    new-instance v1, Le/f/c/l/e/m/g1;

    invoke-direct {v1, v0, p2, p1}, Le/f/c/l/e/m/g1;-><init>(Le/f/c/l/e/m/f1;Le/f/c/l/e/v/f;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v1, p0, Le/f/c/l/e/m/v0;->t:Le/f/c/l/e/m/g1;

    .line 13
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public final a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;J)V
    .locals 14

    const-string v1, "Failed to close fatal exception file output stream."

    const-string v2, "Failed to flush to session begin file."

    const/4 v3, 0x0

    .line 107
    :try_start_0
    new-instance v4, Le/f/c/l/e/s/c;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v6, p3

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "SessionCrash"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Le/f/c/l/e/s/c;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    :try_start_1
    invoke-static {v4}, Le/f/c/l/e/s/e;->a(Ljava/io/OutputStream;)Le/f/c/l/e/s/e;

    move-result-object v3

    const-string v12, "crash"

    const/4 v13, 0x1

    move-object v6, p0

    move-object v7, v3

    move-object v8, p1

    move-object/from16 v9, p2

    move-wide/from16 v10, p4

    .line 109
    invoke-virtual/range {v6 .. v13}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/lang/Thread;Ljava/lang/Throwable;JLjava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v4, v3

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v4, v3

    .line 110
    :goto_0
    :try_start_2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v5

    const-string v6, "An error occurred in the fatal exception logger"

    invoke-virtual {v5, v6, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    :goto_1
    invoke-static {v3, v2}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 112
    invoke-static {v4, v1}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    return-void

    :catchall_1
    move-exception v0

    .line 113
    :goto_2
    invoke-static {v3, v2}, Le/f/c/l/e/m/j;->a(Ljava/io/Flushable;Ljava/lang/String;)V

    .line 114
    invoke-static {v4, v1}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 115
    throw v0
.end method

.method public a([Ljava/io/File;)V
    .locals 8

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 78
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    .line 79
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Found invalid session part file: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 80
    invoke-static {v4}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 82
    :cond_1
    new-instance p1, Le/f/c/l/e/m/s;

    invoke-direct {p1, p0, v0}, Le/f/c/l/e/m/s;-><init>(Le/f/c/l/e/m/v0;Ljava/util/Set;)V

    .line 83
    invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p1

    array-length v0, p1

    :goto_1
    if-ge v2, v0, :cond_2

    aget-object v1, p1, v2

    .line 84
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Deleting invalid session file: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final a([Ljava/io/File;II)V
    .locals 5

    .line 46
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Closing open sessions."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 47
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_0

    .line 48
    aget-object v0, p1, p2

    .line 49
    invoke-static {v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Closing session: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, v0, v1, p3}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/lang/String;I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a([Ljava/io/File;Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/io/File;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 58
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 59
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    .line 60
    sget-object v4, Le/f/c/l/e/m/v0;->C:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 61
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-nez v5, :cond_0

    .line 62
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Deleting unknown file: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    .line 64
    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    .line 65
    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 66
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Trimming session file: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final a(Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 1

    .line 54
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v0

    invoke-static {v0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;[Ljava/io/File;I)[Ljava/io/File;
    .locals 4

    .line 68
    array-length v0, p2

    if-le v0, p3, :cond_0

    .line 69
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p2

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 70
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "Trimming down to %d logged exceptions."

    .line 71
    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-virtual {p2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0, p1, p3}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;I)V

    .line 74
    new-instance p2, Le/f/c/l/e/m/o0;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "SessionEvent"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p0, p2}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p2

    :cond_0
    return-object p2
.end method

.method public final b(J)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 17
    invoke-static {}, Le/f/c/l/e/m/v0;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 19
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 20
    :cond_0
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    .line 21
    new-instance v1, Le/f/c/l/e/m/a0;

    invoke-direct {v1, p0, p1, p2}, Le/f/c/l/e/m/a0;-><init>(Le/f/c/l/e/m/v0;J)V

    invoke-static {v0, v1}, Le/f/a/b/h/n;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Le/f/c/l/e/m/b2;
    .locals 2

    .line 14
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    iget-object p1, p0, Le/f/c/l/e/m/v0;->d:Le/f/c/l/e/m/b2;

    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Le/f/c/l/e/m/t1;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1}, Le/f/c/l/e/m/t1;-><init>(Ljava/io/File;)V

    invoke-virtual {v0, p1}, Le/f/c/l/e/m/t1;->c(Ljava/lang/String;)Le/f/c/l/e/m/b2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b()Le/f/c/l/e/t/c;
    .locals 1

    .line 3
    new-instance v0, Le/f/c/l/e/m/l0;

    invoke-direct {v0, p0}, Le/f/c/l/e/m/l0;-><init>(Le/f/c/l/e/m/v0;)V

    return-object v0
.end method

.method public b(I)Z
    .locals 2

    .line 4
    iget-object v0, p0, Le/f/c/l/e/m/v0;->e:Le/f/c/l/e/m/o;

    invoke-virtual {v0}, Le/f/c/l/e/m/o;->a()V

    .line 5
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v0, "Skipping session finalization because a crash has already occurred."

    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 8
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Finalizing previously open sessions."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/m/v0;->a(IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v1, "Closed all previously open sessions"

    invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception p1

    .line 11
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Unable to finalize previously open sessions."

    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final c(I)V
    .locals 4

    .line 9
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->p()[Ljava/io/File;

    move-result-object v1

    .line 11
    array-length v2, v1

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 12
    aget-object v3, v1, v2

    invoke-static {v3}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Le/f/c/l/e/m/v0;->l:Le/f/c/l/e/n/e;

    invoke-virtual {p1, v0}, Le/f/c/l/e/n/e;->a(Ljava/util/Set;)V

    .line 15
    new-instance p1, Le/f/c/l/e/m/m0;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Le/f/c/l/e/m/m0;-><init>(Le/f/c/l/e/m/w;)V

    invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Le/f/c/l/e/m/v0;->a([Ljava/io/File;Ljava/util/Set;)V

    return-void
.end method

.method public c()Z
    .locals 2

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/v0;->c:Le/f/c/l/e/m/c1;

    invoke-virtual {v0}, Le/f/c/l/e/m/c1;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    invoke-interface {v1, v0}, Le/f/c/l/e/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 5
    :cond_1
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Found previous crash marker."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Le/f/c/l/e/m/v0;->c:Le/f/c/l/e/m/c1;

    invoke-virtual {v0}, Le/f/c/l/e/m/c1;->d()Z

    .line 7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c(Ljava/lang/String;)[Ljava/io/File;
    .locals 1

    .line 8
    new-instance v0, Le/f/c/l/e/m/u0;

    invoke-direct {v0, p1}, Le/f/c/l/e/m/u0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-static {}, Le/f/c/l/e/m/v0;->v()J

    move-result-wide v0

    .line 3
    new-instance v2, Le/f/c/l/e/m/g;

    iget-object v3, p0, Le/f/c/l/e/m/v0;->g:Le/f/c/l/e/m/q1;

    invoke-direct {v2, v3}, Le/f/c/l/e/m/g;-><init>(Le/f/c/l/e/m/q1;)V

    invoke-virtual {v2}, Le/f/c/l/e/m/g;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Opening a new session with ID "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 5
    iget-object v3, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    invoke-interface {v3, v2}, Le/f/c/l/e/a;->a(Ljava/lang/String;)Z

    .line 6
    invoke-virtual {p0, v2, v0, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;J)V

    .line 7
    invoke-virtual {p0, v2}, Le/f/c/l/e/m/v0;->d(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, v2}, Le/f/c/l/e/m/v0;->f(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0, v2}, Le/f/c/l/e/m/v0;->e(Ljava/lang/String;)V

    .line 10
    iget-object v3, p0, Le/f/c/l/e/m/v0;->l:Le/f/c/l/e/n/e;

    invoke-virtual {v3, v2}, Le/f/c/l/e/n/e;->b(Ljava/lang/String;)V

    .line 11
    iget-object v3, p0, Le/f/c/l/e/m/v0;->s:Le/f/c/l/e/m/z1;

    .line 12
    invoke-static {v2}, Le/f/c/l/e/m/v0;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-virtual {v3, v2, v0, v1}, Le/f/c/l/e/m/z1;->a(Ljava/lang/String;J)V

    return-void
.end method

.method public d(I)V
    .locals 3

    .line 14
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->i()Ljava/io/File;

    move-result-object v0

    .line 15
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->g()Ljava/io/File;

    move-result-object v1

    sget-object v2, Le/f/c/l/e/m/v0;->B:Ljava/util/Comparator;

    .line 16
    invoke-static {v0, v1, p1, v2}, Le/f/c/l/e/m/h2;->a(Ljava/io/File;Ljava/io/File;ILjava/util/Comparator;)I

    move-result v0

    sub-int/2addr p1, v0

    .line 17
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->j()Ljava/io/File;

    move-result-object v0

    sget-object v1, Le/f/c/l/e/m/v0;->B:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Le/f/c/l/e/m/h2;->a(Ljava/io/File;ILjava/util/Comparator;)I

    move-result v0

    sub-int/2addr p1, v0

    .line 18
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v0

    sget-object v1, Le/f/c/l/e/m/v0;->z:Ljava/io/FilenameFilter;

    sget-object v2, Le/f/c/l/e/m/v0;->B:Ljava/util/Comparator;

    invoke-static {v0, v1, p1, v2}, Le/f/c/l/e/m/h2;->a(Ljava/io/File;Ljava/io/FilenameFilter;ILjava/util/Comparator;)I

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 19
    iget-object v0, p0, Le/f/c/l/e/m/v0;->g:Le/f/c/l/e/m/q1;

    invoke-virtual {v0}, Le/f/c/l/e/m/q1;->b()Ljava/lang/String;

    move-result-object v0

    .line 20
    iget-object v1, p0, Le/f/c/l/e/m/v0;->i:Le/f/c/l/e/m/b;

    iget-object v8, v1, Le/f/c/l/e/m/b;->e:Ljava/lang/String;

    .line 21
    iget-object v9, v1, Le/f/c/l/e/m/b;->f:Ljava/lang/String;

    .line 22
    iget-object v1, p0, Le/f/c/l/e/m/v0;->g:Le/f/c/l/e/m/q1;

    invoke-virtual {v1}, Le/f/c/l/e/m/q1;->a()Ljava/lang/String;

    move-result-object v10

    .line 23
    iget-object v1, p0, Le/f/c/l/e/m/v0;->i:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->c:Ljava/lang/String;

    .line 24
    invoke-static {v1}, Le/f/c/l/e/m/k1;->a(Ljava/lang/String;)Le/f/c/l/e/m/k1;

    move-result-object v1

    invoke-virtual {v1}, Le/f/c/l/e/m/k1;->a()I

    move-result v11

    .line 25
    new-instance v12, Le/f/c/l/e/m/u;

    move-object v1, v12

    move-object v2, p0

    move-object v3, v0

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    move v7, v11

    invoke-direct/range {v1 .. v7}, Le/f/c/l/e/m/u;-><init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    const-string v1, "SessionApp"

    invoke-virtual {p0, p1, v1, v12}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V

    .line 26
    iget-object v1, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    iget-object v12, p0, Le/f/c/l/e/m/v0;->q:Ljava/lang/String;

    move-object v2, p1

    move-object v8, v12

    invoke-interface/range {v1 .. v8}, Le/f/c/l/e/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public final e()Landroid/content/Context;
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/v0;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v13, p0

    .line 3
    invoke-virtual/range {p0 .. p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;

    move-result-object v0

    .line 4
    new-instance v1, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Le/f/c/l/e/m/j;->a()I

    move-result v16

    .line 6
    sget-object v17, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 7
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v18

    .line 8
    invoke-static {}, Le/f/c/l/e/m/j;->b()J

    move-result-wide v19

    .line 9
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v1

    int-to-long v4, v1

    mul-long v21, v2, v4

    .line 10
    invoke-static {v0}, Le/f/c/l/e/m/j;->i(Landroid/content/Context;)Z

    move-result v23

    .line 11
    invoke-static {v0}, Le/f/c/l/e/m/j;->c(Landroid/content/Context;)I

    move-result v24

    .line 12
    sget-object v25, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 13
    sget-object v26, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 14
    new-instance v14, Le/f/c/l/e/m/x;

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v2, v16

    move-object/from16 v3, v17

    move/from16 v4, v18

    move-wide/from16 v5, v19

    move-wide/from16 v7, v21

    move/from16 v9, v23

    move/from16 v10, v24

    move-object/from16 v11, v25

    move-object/from16 v12, v26

    invoke-direct/range {v0 .. v12}, Le/f/c/l/e/m/x;-><init>(Le/f/c/l/e/m/v0;ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)V

    const-string v0, "SessionDevice"

    move-object/from16 v1, p1

    invoke-virtual {v13, v1, v0, v14}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V

    .line 15
    iget-object v14, v13, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    move-object/from16 v15, p1

    invoke-interface/range {v14 .. v26}, Le/f/c/l/e/a;->a(Ljava/lang/String;ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->p()[Ljava/io/File;

    move-result-object v0

    .line 3
    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    invoke-static {v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 5
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 6
    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 7
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Le/f/c/l/e/m/j;->j(Landroid/content/Context;)Z

    move-result v2

    .line 8
    new-instance v3, Le/f/c/l/e/m/v;

    invoke-direct {v3, p0, v0, v1, v2}, Le/f/c/l/e/m/v;-><init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "SessionOS"

    invoke-virtual {p0, p1, v4, v3}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V

    .line 9
    iget-object v3, p0, Le/f/c/l/e/m/v0;->o:Le/f/c/l/e/a;

    invoke-interface {v3, p1, v0, v1, v2}, Le/f/c/l/e/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public g()Ljava/io/File;
    .locals 3

    .line 4
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v1

    const-string v2, "fatal-sessions"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->b(Ljava/lang/String;)Le/f/c/l/e/m/b2;

    move-result-object v0

    .line 3
    new-instance v1, Le/f/c/l/e/m/y;

    invoke-direct {v1, p0, v0}, Le/f/c/l/e/m/y;-><init>(Le/f/c/l/e/m/v0;Le/f/c/l/e/m/b2;)V

    const-string v0, "SessionUser"

    invoke-virtual {p0, p1, v0, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V

    return-void
.end method

.method public h()Ljava/io/File;
    .locals 1

    .line 3
    iget-object v0, p0, Le/f/c/l/e/m/v0;->h:Le/f/c/l/e/r/h;

    invoke-interface {v0}, Le/f/c/l/e/r/h;->a()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/io/File;
    .locals 3

    .line 3
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v1

    const-string v2, "native-sessions"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public j()Ljava/io/File;
    .locals 3

    .line 2
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v1

    const-string v2, "nonfatal-sessions"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/v0;->t:Le/f/c/l/e/m/g1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/f/c/l/e/m/g1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()[Ljava/io/File;
    .locals 1

    .line 2
    sget-object v0, Le/f/c/l/e/m/v0;->y:Ljava/io/FilenameFilter;

    invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public m()[Ljava/io/File;
    .locals 3

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 3
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->g()Ljava/io/File;

    move-result-object v1

    sget-object v2, Le/f/c/l/e/m/v0;->z:Ljava/io/FilenameFilter;

    invoke-static {v1, v2}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 4
    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->j()Ljava/io/File;

    move-result-object v1

    sget-object v2, Le/f/c/l/e/m/v0;->z:Ljava/io/FilenameFilter;

    invoke-static {v1, v2}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 6
    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;

    move-result-object v1

    sget-object v2, Le/f/c/l/e/m/v0;->z:Ljava/io/FilenameFilter;

    invoke-static {v1, v2}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/io/File;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/io/File;

    return-object v0
.end method

.method public n()[Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->i()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Le/f/c/l/e/m/v0;->d([Ljava/io/File;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public o()[Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/m/v0;->x:Ljava/io/FilenameFilter;

    invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final p()[Ljava/io/File;
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->o()[Ljava/io/File;

    move-result-object v0

    .line 2
    sget-object v1, Le/f/c/l/e/m/v0;->A:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final q()Le/f/a/b/h/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/m/v0;->l()[Ljava/io/File;

    move-result-object v1

    .line 3
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 4
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 5
    invoke-virtual {p0, v5, v6}, Le/f/c/l/e/m/v0;->b(J)Le/f/a/b/h/g;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 6
    :catch_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Could not parse timestamp from file "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 7
    :goto_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v0}, Le/f/a/b/h/n;->a(Ljava/util/Collection;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/v0;->e:Le/f/c/l/e/m/o;

    new-instance v1, Le/f/c/l/e/m/q;

    invoke-direct {v1, p0}, Le/f/c/l/e/m/q;-><init>(Le/f/c/l/e/m/v0;)V

    invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->b(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    return-void
.end method

.method public final s()Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/v0;->b:Le/f/c/l/e/m/i1;

    invoke-virtual {v0}, Le/f/c/l/e/m/i1;->b()Z

    move-result v0

    const/4 v1, 0x1

    .line 2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v2, "Automatic data collection is enabled. Allowing upload."

    invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Le/f/c/l/e/m/v0;->u:Le/f/a/b/h/h;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    .line 5
    invoke-static {v1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v2, "Automatic data collection is disabled."

    invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v2, "Notifying that unsent reports are available."

    invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Le/f/c/l/e/m/v0;->u:Le/f/a/b/h/h;

    invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    .line 9
    iget-object v0, p0, Le/f/c/l/e/m/v0;->b:Le/f/c/l/e/m/i1;

    .line 10
    invoke-virtual {v0}, Le/f/c/l/e/m/i1;->c()Le/f/a/b/h/g;

    move-result-object v0

    new-instance v1, Le/f/c/l/e/m/h0;

    invoke-direct {v1, p0}, Le/f/c/l/e/m/h0;-><init>(Le/f/c/l/e/m/v0;)V

    .line 11
    invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object v0

    .line 12
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    const-string v2, "Waiting for send/deleteUnsentReports to be called."

    invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Le/f/c/l/e/m/v0;->v:Le/f/a/b/h/h;

    invoke-virtual {v1}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object v1

    invoke-static {v0, v1}, Le/f/c/l/e/m/h2;->a(Le/f/a/b/h/g;Le/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method
