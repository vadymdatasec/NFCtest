.class public final Le/b/a/y/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/n;


# instance fields
.field public final b:Lc/e/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/b<",
            "Le/b/a/y/q<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/e0/d;

    invoke-direct {v0}, Le/b/a/e0/d;-><init>()V

    iput-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    return-void
.end method

.method public static a(Le/b/a/y/q;Ljava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/q<",
            "TT;>;",
            "Ljava/lang/Object;",
            "Ljava/security/MessageDigest;",
            ")V"
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p1, p2}, Le/b/a/y/q;->a(Ljava/lang/Object;Ljava/security/MessageDigest;)V

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/q;Ljava/lang/Object;)Le/b/a/y/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/q<",
            "TT;>;TT;)",
            "Le/b/a/y/r;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0, p1, p2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Le/b/a/y/q;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/q<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le/b/a/y/q;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public a(Le/b/a/y/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    iget-object p1, p1, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->a(Lc/e/i;)V

    return-void
.end method

.method public a(Ljava/security/MessageDigest;)V
    .locals 3

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v1}, Lc/e/i;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    iget-object v1, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v1, v0}, Lc/e/i;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/y/q;

    .line 6
    iget-object v2, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v2, v0}, Lc/e/i;->e(I)Ljava/lang/Object;

    move-result-object v2

    .line 7
    invoke-static {v1, v2, p1}, Le/b/a/y/r;->a(Le/b/a/y/q;Ljava/lang/Object;Ljava/security/MessageDigest;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Le/b/a/y/q;)Le/b/a/y/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/q<",
            "*>;)",
            "Le/b/a/y/r;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le/b/a/y/r;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Le/b/a/y/r;

    .line 3
    iget-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    iget-object p1, p1, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0}, Lc/e/i;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Options{values="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/r;->b:Lc/e/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
