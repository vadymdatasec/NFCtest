.class public Le/h/d/a/a/n/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Ljava/util/Date;

.field public c:I

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IIII)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/n/i;->d:Ljava/util/List;

    .line 3
    invoke-virtual {p0}, Le/h/d/a/a/n/i;->e()V

    .line 4
    iput p2, p0, Le/h/d/a/a/n/i;->a:I

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-gt v0, p2, :cond_1

    .line 5
    iget-object v1, p0, Le/h/d/a/a/n/i;->d:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, p1

    mul-int p1, p1, p3

    if-le p1, p4, :cond_0

    move p1, p4

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/n/i;->c:I

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public b()J
    .locals 4

    .line 1
    iget-object v0, p0, Le/h/d/a/a/n/i;->b:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget v2, p0, Le/h/d/a/a/n/i;->a:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public c()Z
    .locals 5

    .line 1
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Le/h/d/a/a/n/i;->b:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget v2, p0, Le/h/d/a/a/n/i;->a:I

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()J
    .locals 8

    .line 1
    iget-object v0, p0, Le/h/d/a/a/n/i;->d:Ljava/util/List;

    iget v1, p0, Le/h/d/a/a/n/i;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Le/h/d/a/a/n/i;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v1

    int-to-long v2, v0

    .line 3
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    add-long/2addr v4, v2

    iget-object v0, p0, Le/h/d/a/a/n/i;->b:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget v0, p0, Le/h/d/a/a/n/i;->a:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_0

    .line 4
    iget-object v0, p0, Le/h/d/a/a/n/i;->b:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget v0, p0, Le/h/d/a/a/n/i;->a:I

    int-to-long v4, v0

    add-long/2addr v2, v4

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long/2addr v2, v0

    :cond_0
    return-wide v2
.end method

.method public e()V
    .locals 1

    .line 1
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/n/i;->b:Ljava/util/Date;

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le/h/d/a/a/n/i;->c:I

    return-void
.end method
