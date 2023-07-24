.class public Lc/d/f/b;
.super Lc/d/f/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/d/f/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    new-instance v0, Lc/d/f/a;

    invoke-direct {v0, p0}, Lc/d/f/a;-><init>(Lc/d/f/b;)V

    sput-object v0, Lc/d/f/j;->r:Lc/d/f/i;

    return-void
.end method
