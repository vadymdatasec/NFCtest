.class public abstract Le/f/a/a/j/j0/j/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/m;
    .locals 7

    .line 1
    invoke-static {}, Le/f/a/a/j/j0/j/m;->c()Le/f/a/a/j/j0/j/i;

    move-result-object v0

    sget-object v1, Le/f/a/a/d;->b:Le/f/a/a/d;

    .line 2
    invoke-static {}, Le/f/a/a/j/j0/j/k;->d()Le/f/a/a/j/j0/j/j;

    move-result-object v2

    const-wide/16 v3, 0x7530

    .line 3
    invoke-virtual {v2, v3, v4}, Le/f/a/a/j/j0/j/j;->a(J)Le/f/a/a/j/j0/j/j;

    const-wide/32 v3, 0x5265c00

    .line 4
    invoke-virtual {v2, v3, v4}, Le/f/a/a/j/j0/j/j;->b(J)Le/f/a/a/j/j0/j/j;

    .line 5
    invoke-virtual {v2}, Le/f/a/a/j/j0/j/j;->a()Le/f/a/a/j/j0/j/k;

    move-result-object v2

    .line 6
    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/j0/j/i;->a(Le/f/a/a/d;Le/f/a/a/j/j0/j/k;)Le/f/a/a/j/j0/j/i;

    sget-object v1, Le/f/a/a/d;->d:Le/f/a/a/d;

    .line 7
    invoke-static {}, Le/f/a/a/j/j0/j/k;->d()Le/f/a/a/j/j0/j/j;

    move-result-object v2

    const-wide/16 v5, 0x3e8

    .line 8
    invoke-virtual {v2, v5, v6}, Le/f/a/a/j/j0/j/j;->a(J)Le/f/a/a/j/j0/j/j;

    .line 9
    invoke-virtual {v2, v3, v4}, Le/f/a/a/j/j0/j/j;->b(J)Le/f/a/a/j/j0/j/j;

    .line 10
    invoke-virtual {v2}, Le/f/a/a/j/j0/j/j;->a()Le/f/a/a/j/j0/j/k;

    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/j0/j/i;->a(Le/f/a/a/d;Le/f/a/a/j/j0/j/k;)Le/f/a/a/j/j0/j/i;

    sget-object v1, Le/f/a/a/d;->c:Le/f/a/a/d;

    .line 12
    invoke-static {}, Le/f/a/a/j/j0/j/k;->d()Le/f/a/a/j/j0/j/j;

    move-result-object v2

    .line 13
    invoke-virtual {v2, v3, v4}, Le/f/a/a/j/j0/j/j;->a(J)Le/f/a/a/j/j0/j/j;

    .line 14
    invoke-virtual {v2, v3, v4}, Le/f/a/a/j/j0/j/j;->b(J)Le/f/a/a/j/j0/j/j;

    const/4 v3, 0x2

    new-array v3, v3, [Le/f/a/a/j/j0/j/l;

    sget-object v4, Le/f/a/a/j/j0/j/l;->b:Le/f/a/a/j/j0/j/l;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    sget-object v4, Le/f/a/a/j/j0/j/l;->c:Le/f/a/a/j/j0/j/l;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 15
    invoke-static {v3}, Le/f/a/a/j/j0/j/m;->a([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/f/a/a/j/j0/j/j;->a(Ljava/util/Set;)Le/f/a/a/j/j0/j/j;

    .line 16
    invoke-virtual {v2}, Le/f/a/a/j/j0/j/j;->a()Le/f/a/a/j/j0/j/k;

    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/j0/j/i;->a(Le/f/a/a/d;Le/f/a/a/j/j0/j/k;)Le/f/a/a/j/j0/j/i;

    .line 18
    invoke-virtual {v0, p0}, Le/f/a/a/j/j0/j/i;->a(Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/i;

    .line 19
    invoke-virtual {v0}, Le/f/a/a/j/j0/j/i;->a()Le/f/a/a/j/j0/j/m;

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/f/a/a/j/l0/a;Ljava/util/Map;)Le/f/a/a/j/j0/j/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/j/l0/a;",
            "Ljava/util/Map<",
            "Le/f/a/a/d;",
            "Le/f/a/a/j/j0/j/k;",
            ">;)",
            "Le/f/a/a/j/j0/j/m;"
        }
    .end annotation

    .line 20
    new-instance v0, Le/f/a/a/j/j0/j/c;

    invoke-direct {v0, p0, p1}, Le/f/a/a/j/j0/j/c;-><init>(Le/f/a/a/j/l0/a;Ljava/util/Map;)V

    return-object v0
.end method

.method public static varargs a([Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 38
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static c()Le/f/a/a/j/j0/j/i;
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/j/j0/j/i;

    invoke-direct {v0}, Le/f/a/a/j/j0/j/i;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final a(IJ)J
    .locals 6

    add-int/lit8 p1, p1, -0x1

    const-wide/16 v0, 0x1

    cmp-long v2, p2, v0

    if-lez v2, :cond_0

    move-wide v0, p2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x2

    :goto_0
    const-wide v2, 0x40c3880000000000L    # 10000.0

    .line 25
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    int-to-long v4, p1

    mul-long v0, v0, v4

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    div-double/2addr v2, v0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 26
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    int-to-double v4, p1

    .line 27
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    long-to-double p1, p2

    mul-double v2, v2, p1

    mul-double v2, v2, v0

    double-to-long p1, v2

    return-wide p1
.end method

.method public a(Le/f/a/a/d;JI)J
    .locals 2

    .line 21
    invoke-virtual {p0}, Le/f/a/a/j/j0/j/m;->a()Le/f/a/a/j/l0/a;

    move-result-object v0

    invoke-interface {v0}, Le/f/a/a/j/l0/a;->a()J

    move-result-wide v0

    sub-long/2addr p2, v0

    .line 22
    invoke-virtual {p0}, Le/f/a/a/j/j0/j/m;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/a/j/j0/j/k;

    .line 23
    invoke-virtual {p1}, Le/f/a/a/j/j0/j/k;->a()J

    move-result-wide v0

    invoke-virtual {p0, p4, v0, v1}, Le/f/a/a/j/j0/j/m;->a(IJ)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    .line 24
    invoke-virtual {p1}, Le/f/a/a/j/j0/j/k;->c()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(Landroid/app/job/JobInfo$Builder;Le/f/a/a/d;JI)Landroid/app/job/JobInfo$Builder;
    .locals 0

    .line 28
    invoke-virtual {p0, p2, p3, p4, p5}, Le/f/a/a/j/j0/j/m;->a(Le/f/a/a/d;JI)J

    move-result-wide p3

    .line 29
    invoke-virtual {p1, p3, p4}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 30
    invoke-virtual {p0}, Le/f/a/a/j/j0/j/m;->b()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/f/a/a/j/j0/j/k;

    invoke-virtual {p2}, Le/f/a/a/j/j0/j/k;->b()Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Le/f/a/a/j/j0/j/m;->a(Landroid/app/job/JobInfo$Builder;Ljava/util/Set;)V

    return-object p1
.end method

.method public abstract a()Le/f/a/a/j/l0/a;
.end method

.method public final a(Landroid/app/job/JobInfo$Builder;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/job/JobInfo$Builder;",
            "Ljava/util/Set<",
            "Le/f/a/a/j/j0/j/l;",
            ">;)V"
        }
    .end annotation

    .line 31
    sget-object v0, Le/f/a/a/j/j0/j/l;->b:Le/f/a/a/j/j0/j/l;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 32
    invoke-virtual {p1, v0}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 34
    :goto_0
    sget-object v0, Le/f/a/a/j/j0/j/l;->d:Le/f/a/a/j/j0/j/l;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 36
    :cond_1
    sget-object v0, Le/f/a/a/j/j0/j/l;->c:Le/f/a/a/j/j0/j/l;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 37
    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    :cond_2
    return-void
.end method

.method public abstract b()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Le/f/a/a/d;",
            "Le/f/a/a/j/j0/j/k;",
            ">;"
        }
    .end annotation
.end method
