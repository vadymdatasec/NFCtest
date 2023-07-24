.class public Le/f/c/l/e/q/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Lk/d0;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lk/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Le/f/c/l/e/q/d;->a:I

    .line 3
    iput-object p2, p0, Le/f/c/l/e/q/d;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Le/f/c/l/e/q/d;->c:Lk/d0;

    return-void
.end method

.method public static a(Lk/z0;)Le/f/c/l/e/q/d;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lk/z0;->c()Lk/b1;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lk/z0;->c()Lk/b1;

    move-result-object v0

    invoke-virtual {v0}, Lk/b1;->o()Ljava/lang/String;

    move-result-object v0

    .line 2
    :goto_0
    new-instance v1, Le/f/c/l/e/q/d;

    invoke-virtual {p0}, Lk/z0;->m()I

    move-result v2

    invoke-virtual {p0}, Lk/z0;->o()Lk/d0;

    move-result-object p0

    invoke-direct {v1, v2, v0, p0}, Le/f/c/l/e/q/d;-><init>(ILjava/lang/String;Lk/d0;)V

    return-object v1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Le/f/c/l/e/q/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Le/f/c/l/e/q/d;->c:Lk/d0;

    invoke-virtual {v0, p1}, Lk/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/l/e/q/d;->a:I

    return v0
.end method
