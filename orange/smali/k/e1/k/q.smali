.class public Lk/e1/k/q;
.super Lk/e1/k/r;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk/e1/k/r;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lk/e1/k/e0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lk/e1/k/a;->g:Lk/e1/k/a;

    invoke-virtual {p1, v0}, Lk/e1/k/e0;->a(Lk/e1/k/a;)V

    return-void
.end method
