.class public final Le/h/d/a/a/v/b$a;
.super Le/h/d/a/a/v/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/h/d/a/a/v/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/h/d/a/a/v/g<",
        "Le/h/d/a/a/v/b;",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/v/a;->k:Le/h/d/a/a/v/a;

    invoke-direct {p0, v0}, Le/h/d/a/a/v/g;-><init>(Li/h/b/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Li/h/c/g;)V
    .locals 0

    invoke-direct {p0}, Le/h/d/a/a/v/b$a;-><init>()V

    return-void
.end method
