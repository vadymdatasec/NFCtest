.class public Lk/v0;
.super Lk/x0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lk/i0;

.field public final synthetic b:I

.field public final synthetic c:[B

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lk/i0;I[BI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/v0;->a:Lk/i0;

    iput p2, p0, Lk/v0;->b:I

    iput-object p3, p0, Lk/v0;->c:[B

    iput p4, p0, Lk/v0;->d:I

    invoke-direct {p0}, Lk/x0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget v0, p0, Lk/v0;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public a(Ll/g;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lk/v0;->c:[B

    iget v1, p0, Lk/v0;->d:I

    iget v2, p0, Lk/v0;->b:I

    invoke-interface {p1, v0, v1, v2}, Ll/g;->write([BII)Ll/g;

    return-void
.end method

.method public b()Lk/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/v0;->a:Lk/i0;

    return-object v0
.end method
