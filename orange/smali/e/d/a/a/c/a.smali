.class public final Le/d/a/a/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/Date;

.field public e:Ljava/lang/Boolean;

.field public f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/lang/Boolean;

.field public h:Le/d/a/a/c/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    return-void
.end method


# virtual methods
.method public a(Le/d/a/a/c/a;)Le/d/a/a/c/a;
    .locals 1

    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_1

    if-eq v0, p0, :cond_0

    .line 16
    iget-object v0, v0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Loops are not allowed in Builder parents"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_1
    iput-object p1, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    return-object p0
.end method

.method public a(Ljava/lang/Boolean;)Le/d/a/a/c/a;
    .locals 0

    .line 22
    iput-object p1, p0, Le/d/a/a/c/a;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/d/a/a/c/a;
    .locals 0

    .line 19
    iput-object p1, p0, Le/d/a/a/c/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/Date;)Le/d/a/a/c/a;
    .locals 0

    .line 21
    iput-object p1, p0, Le/d/a/a/c/a;->d:Ljava/util/Date;

    return-object p0
.end method

.method public a(Ljava/util/Set;)Le/d/a/a/c/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Le/d/a/a/c/a;"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Le/d/a/a/c/a;->c:Ljava/util/Set;

    return-object p0
.end method

.method public a()Le/d/a/a/c/b;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    if-eqz v0, :cond_5

    .line 2
    iget-object v1, p0, Le/d/a/a/c/a;->b:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Le/d/a/a/c/a;->g()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Le/d/a/a/c/a;->b:Ljava/lang/Boolean;

    .line 4
    :cond_0
    iget-object v0, p0, Le/d/a/a/c/a;->c:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    invoke-virtual {v0}, Le/d/a/a/c/a;->c()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le/d/a/a/c/a;->c:Ljava/util/Set;

    .line 6
    :cond_1
    iget-object v0, p0, Le/d/a/a/c/a;->d:Ljava/util/Date;

    if-nez v0, :cond_2

    .line 7
    iget-object v0, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    invoke-virtual {v0}, Le/d/a/a/c/a;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Le/d/a/a/c/a;->d:Ljava/util/Date;

    .line 8
    :cond_2
    iget-object v0, p0, Le/d/a/a/c/a;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    .line 9
    iget-object v0, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    invoke-virtual {v0}, Le/d/a/a/c/a;->f()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Le/d/a/a/c/a;->e:Ljava/lang/Boolean;

    .line 10
    :cond_3
    iget-object v0, p0, Le/d/a/a/c/a;->f:Ljava/util/Set;

    if-nez v0, :cond_4

    .line 11
    iget-object v0, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    invoke-virtual {v0}, Le/d/a/a/c/a;->d()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le/d/a/a/c/a;->f:Ljava/util/Set;

    .line 12
    :cond_4
    iget-object v0, p0, Le/d/a/a/c/a;->g:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    .line 13
    iget-object v0, p0, Le/d/a/a/c/a;->h:Le/d/a/a/c/a;

    invoke-virtual {v0}, Le/d/a/a/c/a;->e()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Le/d/a/a/c/a;->g:Ljava/lang/Boolean;

    .line 14
    :cond_5
    iget-object v0, p0, Le/d/a/a/c/a;->c:Ljava/util/Set;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    .line 15
    :cond_6
    new-instance v0, Le/d/a/a/c/b;

    iget-object v2, p0, Le/d/a/a/c/a;->a:Ljava/lang/String;

    iget-object v3, p0, Le/d/a/a/c/a;->b:Ljava/lang/Boolean;

    iget-object v4, p0, Le/d/a/a/c/a;->c:Ljava/util/Set;

    iget-object v5, p0, Le/d/a/a/c/a;->e:Ljava/lang/Boolean;

    iget-object v6, p0, Le/d/a/a/c/a;->d:Ljava/util/Date;

    iget-object v7, p0, Le/d/a/a/c/a;->f:Ljava/util/Set;

    iget-object v8, p0, Le/d/a/a/c/a;->g:Ljava/lang/Boolean;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Le/d/a/a/c/b;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Set;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Set;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public b(Ljava/lang/Boolean;)Le/d/a/a/c/a;
    .locals 0

    .line 2
    iput-object p1, p0, Le/d/a/a/c/a;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public b(Ljava/util/Set;)Le/d/a/a/c/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Le/d/a/a/c/a;"
        }
    .end annotation

    .line 3
    iput-object p1, p0, Le/d/a/a/c/a;->f:Ljava/util/Set;

    return-object p0
.end method

.method public b()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Le/d/a/a/c/a;->d:Ljava/util/Date;

    return-object v0
.end method

.method public c(Ljava/lang/Boolean;)Le/d/a/a/c/a;
    .locals 0

    .line 1
    iput-object p1, p0, Le/d/a/a/c/a;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/d/a/a/c/a;->c:Ljava/util/Set;

    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/d/a/a/c/a;->f:Ljava/util/Set;

    return-object v0
.end method

.method public e()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Le/d/a/a/c/a;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public f()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Le/d/a/a/c/a;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public g()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Le/d/a/a/c/a;->b:Ljava/lang/Boolean;

    return-object v0
.end method
