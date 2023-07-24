.class public final Lk/e1/i/b;
.super Ll/j;
.source "SourceFile"


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(Ll/x;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ll/j;-><init>(Ll/x;)V

    return-void
.end method


# virtual methods
.method public a(Ll/f;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Ll/j;->a(Ll/f;J)V

    .line 2
    iget-wide v0, p0, Lk/e1/i/b;->c:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lk/e1/i/b;->c:J

    return-void
.end method
