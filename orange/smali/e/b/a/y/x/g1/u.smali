.class public final Le/b/a/y/x/g1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/e0/u/f;


# instance fields
.field public final b:Ljava/security/MessageDigest;

.field public final c:Le/b/a/e0/u/l;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Le/b/a/e0/u/l;->b()Le/b/a/e0/u/l;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/g1/u;->c:Le/b/a/e0/u/l;

    .line 3
    iput-object p1, p0, Le/b/a/y/x/g1/u;->b:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public a()Le/b/a/e0/u/l;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/g1/u;->c:Le/b/a/e0/u/l;

    return-object v0
.end method
