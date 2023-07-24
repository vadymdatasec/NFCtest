.class public Le/c/a/t1;
.super Le/c/a/s1;
.source "SourceFile"

# interfaces
.implements Le/c/a/r1;


# instance fields
.field public n:Ljava/lang/String;

.field public o:Le/c/a/b0;

.field public p:Le/c/a/v1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/c/a/s1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/c/a/v1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/c/a/t1;->p:Le/c/a/v1;

    return-void
.end method

.method public d()Le/c/a/v1;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/t1;->p:Le/c/a/v1;

    return-object v0
.end method
