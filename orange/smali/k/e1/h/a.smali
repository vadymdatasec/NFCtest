.class public final Lk/e1/h/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/h0;


# instance fields
.field public final a:Lk/o0;


# direct methods
.method public constructor <init>(Lk/o0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk/e1/h/a;->a:Lk/o0;

    return-void
.end method


# virtual methods
.method public a(Lk/g0;)Lk/z0;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object v0, p1

    check-cast v0, Lk/e1/i/i;

    .line 2
    invoke-virtual {v0}, Lk/e1/i/i;->b()Lk/u0;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lk/e1/i/i;->i()Lk/e1/h/h;

    move-result-object v2

    .line 4
    invoke-virtual {v1}, Lk/u0;->e()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GET"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    .line 5
    iget-object v4, p0, Lk/e1/h/a;->a:Lk/o0;

    invoke-virtual {v2, v4, p1, v3}, Lk/e1/h/h;->a(Lk/o0;Lk/g0;Z)Lk/e1/i/d;

    move-result-object p1

    .line 6
    invoke-virtual {v2}, Lk/e1/h/h;->c()Lk/e1/h/c;

    move-result-object v3

    .line 7
    invoke-virtual {v0, v1, v2, p1, v3}, Lk/e1/i/i;->a(Lk/u0;Lk/e1/h/h;Lk/e1/i/d;Lk/e1/h/c;)Lk/z0;

    move-result-object p1

    return-object p1
.end method
