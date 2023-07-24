.class public Le/f/c/l/e/m/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/f/c/l/e/m/q1;

.field public final c:Le/f/c/l/e/m/b;

.field public final d:Le/f/c/l/e/w/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "17.2.2"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "Crashlytics Android SDK/%s"

    .line 2
    invoke-static {v0, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/m/d1;->e:Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Le/f/c/l/e/m/d1;->f:Ljava/util/Map;

    const/4 v2, 0x5

    .line 4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "armeabi"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v0, Le/f/c/l/e/m/d1;->f:Ljava/util/Map;

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "armeabi-v7a"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v0, Le/f/c/l/e/m/d1;->f:Ljava/util/Map;

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "arm64-v8a"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    sget-object v0, Le/f/c/l/e/m/d1;->f:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "x86"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object v0, Le/f/c/l/e/m/d1;->f:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "x86_64"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/b;Le/f/c/l/e/w/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/f/c/l/e/m/d1;->b:Le/f/c/l/e/m/q1;

    .line 4
    iput-object p3, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    .line 5
    iput-object p4, p0, Le/f/c/l/e/m/d1;->d:Le/f/c/l/e/w/d;

    return-void
.end method

.method public static h()I
    .locals 4

    .line 1
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x7

    if-eqz v1, :cond_0

    return v2

    .line 3
    :cond_0
    sget-object v1, Le/f/c/l/e/m/d1;->f:Ljava/util/Map;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    return v2

    .line 4
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a(Le/f/c/l/e/w/e;Ljava/lang/Thread;IIZ)Le/f/c/l/e/o/a3;
    .locals 1

    .line 43
    invoke-static {}, Le/f/c/l/e/o/a3;->e()Le/f/c/l/e/o/r2;

    move-result-object v0

    .line 44
    invoke-virtual {p0, p1, p2, p3, p5}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;Ljava/lang/Thread;IZ)Le/f/c/l/e/o/p3;

    move-result-object p2

    .line 45
    invoke-virtual {v0, p2}, Le/f/c/l/e/o/r2;->b(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;

    .line 46
    invoke-virtual {p0, p1, p3, p4}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;II)Le/f/c/l/e/o/t2;

    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/r2;

    .line 48
    invoke-virtual {p0}, Le/f/c/l/e/m/d1;->g()Le/f/c/l/e/o/v2;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/v2;)Le/f/c/l/e/o/r2;

    .line 49
    invoke-virtual {p0}, Le/f/c/l/e/m/d1;->c()Le/f/c/l/e/o/p3;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;

    .line 50
    invoke-virtual {v0}, Le/f/c/l/e/o/r2;->a()Le/f/c/l/e/o/a3;

    move-result-object p1

    return-object p1
.end method

.method public final a()Le/f/c/l/e/o/b2;
    .locals 2

    .line 11
    invoke-static {}, Le/f/c/l/e/o/o3;->l()Le/f/c/l/e/o/b2;

    move-result-object v0

    const-string v1, "17.2.2"

    .line 12
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->e(Ljava/lang/String;)Le/f/c/l/e/o/b2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->a:Ljava/lang/String;

    .line 13
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->c(Ljava/lang/String;)Le/f/c/l/e/o/b2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->b:Le/f/c/l/e/m/q1;

    .line 14
    invoke-virtual {v1}, Le/f/c/l/e/m/q1;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->d(Ljava/lang/String;)Le/f/c/l/e/o/b2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->e:Ljava/lang/String;

    .line 15
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(Ljava/lang/String;)Le/f/c/l/e/o/b2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->f:Ljava/lang/String;

    .line 16
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->b(Ljava/lang/String;)Le/f/c/l/e/o/b2;

    const/4 v1, 0x4

    .line 17
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(I)Le/f/c/l/e/o/b2;

    return-object v0
.end method

.method public final a(ILe/f/c/l/e/w/e;Ljava/lang/Thread;IIZ)Le/f/c/l/e/o/b3;
    .locals 8

    .line 18
    iget-object v0, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v0, v0, Le/f/c/l/e/m/b;->d:Ljava/lang/String;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    .line 19
    invoke-static {v0, v1}, Le/f/c/l/e/m/j;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 20
    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_1
    invoke-static {}, Le/f/c/l/e/o/b3;->f()Le/f/c/l/e/o/o2;

    move-result-object v1

    .line 23
    invoke-virtual {v1, v0}, Le/f/c/l/e/o/o2;->a(Ljava/lang/Boolean;)Le/f/c/l/e/o/o2;

    .line 24
    invoke-virtual {v1, p1}, Le/f/c/l/e/o/o2;->a(I)Le/f/c/l/e/o/o2;

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    .line 25
    invoke-virtual/range {v2 .. v7}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;Ljava/lang/Thread;IIZ)Le/f/c/l/e/o/a3;

    move-result-object p1

    .line 26
    invoke-virtual {v1, p1}, Le/f/c/l/e/o/o2;->a(Le/f/c/l/e/o/a3;)Le/f/c/l/e/o/o2;

    .line 27
    invoke-virtual {v1}, Le/f/c/l/e/o/o2;->a()Le/f/c/l/e/o/b3;

    move-result-object p1

    return-object p1
.end method

.method public final a(I)Le/f/c/l/e/o/e3;
    .locals 8

    .line 28
    iget-object v0, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/e;->a(Landroid/content/Context;)Le/f/c/l/e/m/e;

    move-result-object v0

    .line 29
    invoke-virtual {v0}, Le/f/c/l/e/m/e;->a()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    invoke-virtual {v0}, Le/f/c/l/e/m/e;->b()I

    move-result v0

    .line 32
    iget-object v2, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    invoke-static {v2}, Le/f/c/l/e/m/j;->f(Landroid/content/Context;)Z

    move-result v2

    .line 33
    invoke-static {}, Le/f/c/l/e/m/j;->b()J

    move-result-wide v3

    iget-object v5, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    invoke-static {v5}, Le/f/c/l/e/m/j;->a(Landroid/content/Context;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    .line 34
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Le/f/c/l/e/m/j;->a(Ljava/lang/String;)J

    move-result-wide v5

    .line 35
    invoke-static {}, Le/f/c/l/e/o/e3;->g()Le/f/c/l/e/o/d3;

    move-result-object v7

    .line 36
    invoke-virtual {v7, v1}, Le/f/c/l/e/o/d3;->a(Ljava/lang/Double;)Le/f/c/l/e/o/d3;

    .line 37
    invoke-virtual {v7, v0}, Le/f/c/l/e/o/d3;->a(I)Le/f/c/l/e/o/d3;

    .line 38
    invoke-virtual {v7, v2}, Le/f/c/l/e/o/d3;->a(Z)Le/f/c/l/e/o/d3;

    .line 39
    invoke-virtual {v7, p1}, Le/f/c/l/e/o/d3;->b(I)Le/f/c/l/e/o/d3;

    .line 40
    invoke-virtual {v7, v3, v4}, Le/f/c/l/e/o/d3;->b(J)Le/f/c/l/e/o/d3;

    .line 41
    invoke-virtual {v7, v5, v6}, Le/f/c/l/e/o/d3;->a(J)Le/f/c/l/e/o/d3;

    .line 42
    invoke-virtual {v7}, Le/f/c/l/e/o/d3;->a()Le/f/c/l/e/o/e3;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Le/f/c/l/e/o/h3;
    .locals 10

    move-object v7, p0

    .line 2
    iget-object v0, v7, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v8, v0, Landroid/content/res/Configuration;->orientation:I

    .line 3
    new-instance v2, Le/f/c/l/e/w/e;

    iget-object v0, v7, Le/f/c/l/e/m/d1;->d:Le/f/c/l/e/w/d;

    move-object v1, p1

    invoke-direct {v2, p1, v0}, Le/f/c/l/e/w/e;-><init>(Ljava/lang/Throwable;Le/f/c/l/e/w/d;)V

    .line 4
    invoke-static {}, Le/f/c/l/e/o/h3;->g()Le/f/c/l/e/o/c3;

    move-result-object v9

    move-object v0, p3

    .line 5
    invoke-virtual {v9, p3}, Le/f/c/l/e/o/c3;->a(Ljava/lang/String;)Le/f/c/l/e/o/c3;

    move-wide v0, p4

    .line 6
    invoke-virtual {v9, p4, p5}, Le/f/c/l/e/o/c3;->a(J)Le/f/c/l/e/o/c3;

    move-object v0, p0

    move v1, v8

    move-object v3, p2

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    .line 7
    invoke-virtual/range {v0 .. v6}, Le/f/c/l/e/m/d1;->a(ILe/f/c/l/e/w/e;Ljava/lang/Thread;IIZ)Le/f/c/l/e/o/b3;

    move-result-object v0

    .line 8
    invoke-virtual {v9, v0}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/b3;)Le/f/c/l/e/o/c3;

    .line 9
    invoke-virtual {p0, v8}, Le/f/c/l/e/m/d1;->a(I)Le/f/c/l/e/o/e3;

    move-result-object v0

    invoke-virtual {v9, v0}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/e3;)Le/f/c/l/e/o/c3;

    .line 10
    invoke-virtual {v9}, Le/f/c/l/e/o/c3;->a()Le/f/c/l/e/o/h3;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;J)Le/f/c/l/e/o/o3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/d1;->a()Le/f/c/l/e/o/b2;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Le/f/c/l/e/m/d1;->b(Ljava/lang/String;J)Le/f/c/l/e/o/m3;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/m3;)Le/f/c/l/e/o/b2;

    invoke-virtual {v0}, Le/f/c/l/e/o/b2;->a()Le/f/c/l/e/o/o3;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/f/c/l/e/w/e;Ljava/lang/Thread;IZ)Le/f/c/l/e/o/p3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/w/e;",
            "Ljava/lang/Thread;",
            "IZ)",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/z2;",
            ">;"
        }
    .end annotation

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    iget-object p1, p1, Le/f/c/l/e/w/e;->c:[Ljava/lang/StackTraceElement;

    .line 53
    invoke-virtual {p0, p2, p1, p3}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/z2;

    move-result-object p1

    .line 54
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    .line 55
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p1

    .line 56
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 57
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Thread;

    .line 58
    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 59
    iget-object v1, p0, Le/f/c/l/e/m/d1;->d:Le/f/c/l/e/w/d;

    .line 60
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    invoke-interface {v1, p3}, Le/f/c/l/e/w/d;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    move-result-object p3

    .line 61
    invoke-virtual {p0, p4, p3}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Le/f/c/l/e/o/z2;

    move-result-object p3

    .line 62
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 63
    :cond_1
    invoke-static {v0}, Le/f/c/l/e/o/p3;->a(Ljava/util/List;)Le/f/c/l/e/o/p3;

    move-result-object p1

    return-object p1
.end method

.method public final a([Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/p3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/StackTraceElement;",
            "I)",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/y2;",
            ">;"
        }
    .end annotation

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 72
    invoke-static {}, Le/f/c/l/e/o/y2;->f()Le/f/c/l/e/o/x2;

    move-result-object v4

    invoke-virtual {v4, p2}, Le/f/c/l/e/o/x2;->a(I)Le/f/c/l/e/o/x2;

    invoke-virtual {p0, v3, v4}, Le/f/c/l/e/m/d1;->a(Ljava/lang/StackTraceElement;Le/f/c/l/e/o/x2;)Le/f/c/l/e/o/y2;

    move-result-object v3

    .line 73
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {v0}, Le/f/c/l/e/o/p3;->a(Ljava/util/List;)Le/f/c/l/e/o/p3;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/f/c/l/e/w/e;II)Le/f/c/l/e/o/t2;
    .locals 1

    const/4 v0, 0x0

    .line 75
    invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;III)Le/f/c/l/e/o/t2;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/f/c/l/e/w/e;III)Le/f/c/l/e/o/t2;
    .locals 5

    .line 76
    iget-object v0, p1, Le/f/c/l/e/w/e;->b:Ljava/lang/String;

    .line 77
    iget-object v1, p1, Le/f/c/l/e/w/e;->a:Ljava/lang/String;

    .line 78
    iget-object v2, p1, Le/f/c/l/e/w/e;->c:[Ljava/lang/StackTraceElement;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v2, v3, [Ljava/lang/StackTraceElement;

    .line 79
    :goto_0
    iget-object p1, p1, Le/f/c/l/e/w/e;->d:Le/f/c/l/e/w/e;

    if-lt p4, p3, :cond_1

    move-object v4, p1

    :goto_1
    if-eqz v4, :cond_1

    .line 80
    iget-object v4, v4, Le/f/c/l/e/w/e;->d:Le/f/c/l/e/w/e;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 81
    :cond_1
    invoke-static {}, Le/f/c/l/e/o/t2;->f()Le/f/c/l/e/o/s2;

    move-result-object v4

    .line 82
    invoke-virtual {v4, v0}, Le/f/c/l/e/o/s2;->b(Ljava/lang/String;)Le/f/c/l/e/o/s2;

    .line 83
    invoke-virtual {v4, v1}, Le/f/c/l/e/o/s2;->a(Ljava/lang/String;)Le/f/c/l/e/o/s2;

    .line 84
    invoke-virtual {p0, v2, p2}, Le/f/c/l/e/m/d1;->a([Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/p3;

    move-result-object v0

    invoke-static {v0}, Le/f/c/l/e/o/p3;->a(Ljava/util/List;)Le/f/c/l/e/o/p3;

    move-result-object v0

    invoke-virtual {v4, v0}, Le/f/c/l/e/o/s2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/s2;

    .line 85
    invoke-virtual {v4, v3}, Le/f/c/l/e/o/s2;->a(I)Le/f/c/l/e/o/s2;

    if-eqz p1, :cond_2

    if-nez v3, :cond_2

    add-int/lit8 p4, p4, 0x1

    .line 86
    invoke-virtual {p0, p1, p2, p3, p4}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;III)Le/f/c/l/e/o/t2;

    move-result-object p1

    .line 87
    invoke-virtual {v4, p1}, Le/f/c/l/e/o/s2;->a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/s2;

    .line 88
    :cond_2
    invoke-virtual {v4}, Le/f/c/l/e/o/s2;->a()Le/f/c/l/e/o/t2;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/StackTraceElement;Le/f/c/l/e/o/x2;)Le/f/c/l/e/o/y2;
    .locals 7

    .line 89
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    int-to-long v3, v0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    .line 91
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v5

    .line 93
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    if-lez v6, :cond_1

    .line 94
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    int-to-long v1, p1

    .line 95
    :cond_1
    invoke-virtual {p2, v3, v4}, Le/f/c/l/e/o/x2;->b(J)Le/f/c/l/e/o/x2;

    invoke-virtual {p2, v0}, Le/f/c/l/e/o/x2;->b(Ljava/lang/String;)Le/f/c/l/e/o/x2;

    invoke-virtual {p2, v5}, Le/f/c/l/e/o/x2;->a(Ljava/lang/String;)Le/f/c/l/e/o/x2;

    invoke-virtual {p2, v1, v2}, Le/f/c/l/e/o/x2;->a(J)Le/f/c/l/e/o/x2;

    invoke-virtual {p2}, Le/f/c/l/e/o/x2;->a()Le/f/c/l/e/o/y2;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Le/f/c/l/e/o/z2;
    .locals 1

    const/4 v0, 0x0

    .line 64
    invoke-virtual {p0, p1, p2, v0}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/z2;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/z2;
    .locals 1

    .line 65
    invoke-static {}, Le/f/c/l/e/o/z2;->d()Le/f/c/l/e/o/w2;

    move-result-object v0

    .line 66
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/w2;->a(Ljava/lang/String;)Le/f/c/l/e/o/w2;

    .line 67
    invoke-virtual {v0, p3}, Le/f/c/l/e/o/w2;->a(I)Le/f/c/l/e/o/w2;

    .line 68
    invoke-virtual {p0, p2, p3}, Le/f/c/l/e/m/d1;->a([Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/p3;

    move-result-object p1

    invoke-static {p1}, Le/f/c/l/e/o/p3;->a(Ljava/util/List;)Le/f/c/l/e/o/p3;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/w2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/w2;

    .line 69
    invoke-virtual {v0}, Le/f/c/l/e/o/w2;->a()Le/f/c/l/e/o/z2;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;J)Le/f/c/l/e/o/m3;
    .locals 1

    .line 1
    invoke-static {}, Le/f/c/l/e/o/m3;->n()Le/f/c/l/e/o/l2;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p2, p3}, Le/f/c/l/e/o/l2;->a(J)Le/f/c/l/e/o/l2;

    .line 3
    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->b(Ljava/lang/String;)Le/f/c/l/e/o/l2;

    sget-object p1, Le/f/c/l/e/m/d1;->e:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Ljava/lang/String;)Le/f/c/l/e/o/l2;

    .line 5
    invoke-virtual {p0}, Le/f/c/l/e/m/d1;->d()Le/f/c/l/e/o/k2;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/k2;)Le/f/c/l/e/o/l2;

    .line 6
    invoke-virtual {p0}, Le/f/c/l/e/m/d1;->f()Le/f/c/l/e/o/j3;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/j3;)Le/f/c/l/e/o/l2;

    .line 7
    invoke-virtual {p0}, Le/f/c/l/e/m/d1;->e()Le/f/c/l/e/o/n2;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/n2;)Le/f/c/l/e/o/l2;

    const/4 p1, 0x3

    .line 8
    invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(I)Le/f/c/l/e/o/l2;

    .line 9
    invoke-virtual {v0}, Le/f/c/l/e/o/l2;->a()Le/f/c/l/e/o/m3;

    move-result-object p1

    return-object p1
.end method

.method public final b()Le/f/c/l/e/o/q2;
    .locals 3

    .line 10
    invoke-static {}, Le/f/c/l/e/o/q2;->f()Le/f/c/l/e/o/p2;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/p2;->a(J)Le/f/c/l/e/o/p2;

    .line 12
    invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/p2;->b(J)Le/f/c/l/e/o/p2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->d:Ljava/lang/String;

    .line 13
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/p2;->a(Ljava/lang/String;)Le/f/c/l/e/o/p2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->b:Ljava/lang/String;

    .line 14
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/p2;->b(Ljava/lang/String;)Le/f/c/l/e/o/p2;

    .line 15
    invoke-virtual {v0}, Le/f/c/l/e/o/p2;->a()Le/f/c/l/e/o/q2;

    move-result-object v0

    return-object v0
.end method

.method public final c()Le/f/c/l/e/o/p3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/q2;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Le/f/c/l/e/o/q2;

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/d1;->b()Le/f/c/l/e/o/q2;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Le/f/c/l/e/o/p3;->a([Ljava/lang/Object;)Le/f/c/l/e/o/p3;

    move-result-object v0

    return-object v0
.end method

.method public final d()Le/f/c/l/e/o/k2;
    .locals 2

    .line 1
    invoke-static {}, Le/f/c/l/e/o/k2;->f()Le/f/c/l/e/o/i2;

    move-result-object v0

    iget-object v1, p0, Le/f/c/l/e/m/d1;->b:Le/f/c/l/e/m/q1;

    .line 2
    invoke-virtual {v1}, Le/f/c/l/e/m/q1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->b(Ljava/lang/String;)Le/f/c/l/e/o/i2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->e:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->d(Ljava/lang/String;)Le/f/c/l/e/o/i2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->c:Le/f/c/l/e/m/b;

    iget-object v1, v1, Le/f/c/l/e/m/b;->f:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->a(Ljava/lang/String;)Le/f/c/l/e/o/i2;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->b:Le/f/c/l/e/m/q1;

    .line 5
    invoke-virtual {v1}, Le/f/c/l/e/m/q1;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->c(Ljava/lang/String;)Le/f/c/l/e/o/i2;

    .line 6
    invoke-virtual {v0}, Le/f/c/l/e/o/i2;->a()Le/f/c/l/e/o/k2;

    move-result-object v0

    return-object v0
.end method

.method public final e()Le/f/c/l/e/o/n2;
    .locals 11

    .line 1
    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Le/f/c/l/e/m/d1;->h()I

    move-result v1

    .line 3
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    .line 4
    invoke-static {}, Le/f/c/l/e/m/j;->b()J

    move-result-wide v3

    .line 5
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v7, v0

    mul-long v5, v5, v7

    .line 6
    iget-object v0, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/j;->i(Landroid/content/Context;)Z

    move-result v0

    .line 7
    iget-object v7, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    invoke-static {v7}, Le/f/c/l/e/m/j;->c(Landroid/content/Context;)I

    move-result v7

    .line 8
    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 9
    sget-object v9, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 10
    invoke-static {}, Le/f/c/l/e/o/n2;->j()Le/f/c/l/e/o/m2;

    move-result-object v10

    .line 11
    invoke-virtual {v10, v1}, Le/f/c/l/e/o/m2;->a(I)Le/f/c/l/e/o/m2;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 12
    invoke-virtual {v10, v1}, Le/f/c/l/e/o/m2;->b(Ljava/lang/String;)Le/f/c/l/e/o/m2;

    .line 13
    invoke-virtual {v10, v2}, Le/f/c/l/e/o/m2;->b(I)Le/f/c/l/e/o/m2;

    .line 14
    invoke-virtual {v10, v3, v4}, Le/f/c/l/e/o/m2;->b(J)Le/f/c/l/e/o/m2;

    .line 15
    invoke-virtual {v10, v5, v6}, Le/f/c/l/e/o/m2;->a(J)Le/f/c/l/e/o/m2;

    .line 16
    invoke-virtual {v10, v0}, Le/f/c/l/e/o/m2;->a(Z)Le/f/c/l/e/o/m2;

    .line 17
    invoke-virtual {v10, v7}, Le/f/c/l/e/o/m2;->c(I)Le/f/c/l/e/o/m2;

    .line 18
    invoke-virtual {v10, v8}, Le/f/c/l/e/o/m2;->a(Ljava/lang/String;)Le/f/c/l/e/o/m2;

    .line 19
    invoke-virtual {v10, v9}, Le/f/c/l/e/o/m2;->c(Ljava/lang/String;)Le/f/c/l/e/o/m2;

    .line 20
    invoke-virtual {v10}, Le/f/c/l/e/o/m2;->a()Le/f/c/l/e/o/n2;

    move-result-object v0

    return-object v0
.end method

.method public final f()Le/f/c/l/e/o/j3;
    .locals 2

    .line 1
    invoke-static {}, Le/f/c/l/e/o/j3;->e()Le/f/c/l/e/o/i3;

    move-result-object v0

    const/4 v1, 0x3

    .line 2
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(I)Le/f/c/l/e/o/i3;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->b(Ljava/lang/String;)Le/f/c/l/e/o/i3;

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(Ljava/lang/String;)Le/f/c/l/e/o/i3;

    iget-object v1, p0, Le/f/c/l/e/m/d1;->a:Landroid/content/Context;

    .line 5
    invoke-static {v1}, Le/f/c/l/e/m/j;->j(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(Z)Le/f/c/l/e/o/i3;

    .line 6
    invoke-virtual {v0}, Le/f/c/l/e/o/i3;->a()Le/f/c/l/e/o/j3;

    move-result-object v0

    return-object v0
.end method

.method public final g()Le/f/c/l/e/o/v2;
    .locals 3

    .line 1
    invoke-static {}, Le/f/c/l/e/o/v2;->d()Le/f/c/l/e/o/u2;

    move-result-object v0

    const-string v1, "0"

    .line 2
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/u2;->b(Ljava/lang/String;)Le/f/c/l/e/o/u2;

    .line 3
    invoke-virtual {v0, v1}, Le/f/c/l/e/o/u2;->a(Ljava/lang/String;)Le/f/c/l/e/o/u2;

    const-wide/16 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/u2;->a(J)Le/f/c/l/e/o/u2;

    .line 5
    invoke-virtual {v0}, Le/f/c/l/e/o/u2;->a()Le/f/c/l/e/o/v2;

    move-result-object v0

    return-object v0
.end method
