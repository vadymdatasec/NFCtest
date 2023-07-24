.class public Lm/b/j/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lm/b/j/j3;

.field public b:I

.field public c:Lm/b/j/d0;

.field public d:Lm/b/j/e0;


# direct methods
.method public constructor <init>(Lm/b/j/j3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm/b/j/f0;->b:I

    .line 3
    iput-object p1, p0, Lm/b/j/f0;->a:Lm/b/j/j3;

    .line 4
    invoke-virtual {p1}, Lm/b/j/j3;->b()Lm/b/j/e0;

    move-result-object p1

    iput-object p1, p0, Lm/b/j/f0;->d:Lm/b/j/e0;

    return-void
.end method

.method public static b()Lm/b/j/f0;
    .locals 2

    .line 1
    new-instance v0, Lm/b/j/f0;

    new-instance v1, Lm/b/j/b;

    invoke-direct {v1}, Lm/b/j/b;-><init>()V

    invoke-direct {v0, v1}, Lm/b/j/f0;-><init>(Lm/b/j/j3;)V

    return-object v0
.end method

.method public static c()Lm/b/j/f0;
    .locals 2

    .line 1
    new-instance v0, Lm/b/j/f0;

    new-instance v1, Lm/b/j/l3;

    invoke-direct {v1}, Lm/b/j/l3;-><init>()V

    invoke-direct {v0, v1}, Lm/b/j/f0;-><init>(Lm/b/j/j3;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/i;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm/b/j/f0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lm/b/j/f0;->b:I

    invoke-static {v0}, Lm/b/j/d0;->a(I)Lm/b/j/d0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lm/b/j/d0;->b()Lm/b/j/d0;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lm/b/j/f0;->c:Lm/b/j/d0;

    .line 2
    iget-object v1, p0, Lm/b/j/f0;->a:Lm/b/j/j3;

    iget-object v2, p0, Lm/b/j/f0;->d:Lm/b/j/e0;

    invoke-virtual {v1, p1, p2, v0, v2}, Lm/b/j/j3;->b(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)Lm/b/i/i;

    move-result-object p1

    return-object p1
.end method

.method public a()Z
    .locals 1

    .line 3
    iget v0, p0, Lm/b/j/f0;->b:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
