.class public interface abstract Le/b/a/y/y/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/b/a/y/y/k0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/y/j0;

    invoke-direct {v0}, Le/b/a/y/y/j0;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/y/m0;

    invoke-direct {v0}, Le/b/a/y/y/m0;-><init>()V

    invoke-virtual {v0}, Le/b/a/y/y/m0;->a()Le/b/a/y/y/o0;

    move-result-object v0

    sput-object v0, Le/b/a/y/y/k0;->a:Le/b/a/y/y/k0;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
