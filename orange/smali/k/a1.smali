.class public Lk/a1;
.super Lk/b1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lk/i0;

.field public final synthetic c:J

.field public final synthetic d:Ll/h;


# direct methods
.method public constructor <init>(Lk/i0;JLl/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/a1;->b:Lk/i0;

    iput-wide p2, p0, Lk/a1;->c:J

    iput-object p4, p0, Lk/a1;->d:Ll/h;

    invoke-direct {p0}, Lk/b1;-><init>()V

    return-void
.end method


# virtual methods
.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk/a1;->c:J

    return-wide v0
.end method

.method public m()Lk/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a1;->b:Lk/i0;

    return-object v0
.end method

.method public n()Ll/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a1;->d:Ll/h;

    return-object v0
.end method
