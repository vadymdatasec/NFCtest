.class public final Lm/a/b/h/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, -0x1

    if-nez p1, :cond_1

    return v0

    :cond_1
    const/4 v1, 0x1

    if-nez p2, :cond_2

    return v1

    .line 1
    :cond_2
    check-cast p1, Lm/a/b/h/j;

    .line 2
    check-cast p2, Lm/a/b/h/j;

    .line 3
    invoke-virtual {p1}, Lm/a/b/h/j;->f()J

    move-result-wide v2

    invoke-virtual {p2}, Lm/a/b/h/j;->f()J

    move-result-wide p1

    cmp-long v4, v2, p1

    if-gez v4, :cond_3

    return v1

    :cond_3
    return v0
.end method
