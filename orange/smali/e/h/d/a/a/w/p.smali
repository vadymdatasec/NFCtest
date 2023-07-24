.class public final Le/h/d/a/a/w/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:D

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/h/d/a/a/w/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/w/p;->a:Ljava/lang/Integer;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/w/p;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/w/p;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x2

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/w/p;->a(Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    .line 1
    iget-wide v0, p0, Le/h/d/a/a/w/p;->b:D

    return-wide v0
.end method

.method public final a(Le/h/d/a/a/w/o;)V
    .locals 1

    const-string v0, "rssiValue"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Le/h/d/a/a/w/p;->a:Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Le/h/d/a/a/w/p;->a(Ljava/lang/Integer;)V

    .line 3
    iget-object v0, p0, Le/h/d/a/a/w/p;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-virtual {p0}, Le/h/d/a/a/w/p;->b()V

    return-void
.end method

.method public final a(Ljava/lang/Integer;)V
    .locals 4

    .line 6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 7
    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    neg-int p1, p1

    const/16 v1, 0xd

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 8
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    .line 9
    iget-object v0, p0, Le/h/d/a/a/w/p;->c:Ljava/util/List;

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Le/h/d/a/a/w/o;

    .line 12
    invoke-virtual {v3}, Le/h/d/a/a/w/o;->a()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_1
    invoke-static {v1}, Li/h/c/p;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 14
    iput-object p1, p0, Le/h/d/a/a/w/p;->c:Ljava/util/List;

    return-void
.end method

.method public final b()V
    .locals 5

    .line 5
    iget-object v0, p0, Le/h/d/a/a/w/p;->c:Ljava/util/List;

    const/4 v1, 0x0

    int-to-double v1, v1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/h/d/a/a/w/o;

    invoke-virtual {v3}, Le/h/d/a/a/w/o;->b()I

    move-result v3

    int-to-double v3, v3

    add-double/2addr v1, v3

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/w/p;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v3, v0

    div-double/2addr v1, v3

    iput-wide v1, p0, Le/h/d/a/a/w/p;->b:D

    return-void
.end method

.method public final b(Ljava/lang/Integer;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/h/d/a/a/w/p;->a:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/w/p;->a:Ljava/lang/Integer;

    .line 3
    :goto_0
    iget-object p1, p0, Le/h/d/a/a/w/p;->a:Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Le/h/d/a/a/w/p;->a(Ljava/lang/Integer;)V

    .line 4
    invoke-virtual {p0}, Le/h/d/a/a/w/p;->b()V

    return-void
.end method
