.class public final Le/f/d/v;
.super Le/f/d/t;
.source "SourceFile"


# instance fields
.field public final a:Le/f/d/d0/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/x<",
            "Le/f/d/t;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Le/f/d/t;-><init>()V

    .line 2
    new-instance v0, Le/f/d/d0/x;

    invoke-direct {v0}, Le/f/d/d0/x;-><init>()V

    iput-object v0, p0, Le/f/d/v;->a:Le/f/d/d0/x;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Le/f/d/t;)V
    .locals 1

    if-nez p2, :cond_0

    .line 1
    sget-object p2, Le/f/d/u;->a:Le/f/d/u;

    .line 2
    :cond_0
    iget-object v0, p0, Le/f/d/v;->a:Le/f/d/d0/x;

    invoke-static {p1}, Le/f/d/d0/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Le/f/d/d0/x;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    .line 1
    instance-of v0, p1, Le/f/d/v;

    if-eqz v0, :cond_0

    check-cast p1, Le/f/d/v;

    iget-object p1, p1, Le/f/d/v;->a:Le/f/d/d0/x;

    iget-object v0, p0, Le/f/d/v;->a:Le/f/d/d0/x;

    invoke-virtual {p1, v0}, Ljava/util/AbstractMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public h()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Le/f/d/t;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/v;->a:Le/f/d/d0/x;

    invoke-virtual {v0}, Le/f/d/d0/x;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/v;->a:Le/f/d/d0/x;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->hashCode()I

    move-result v0

    return v0
.end method
