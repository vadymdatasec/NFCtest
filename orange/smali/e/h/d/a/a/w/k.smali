.class public Le/h/d/a/a/w/k;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/h/d/a/a/o/a/m;

.field public final synthetic b:Lfr/mbs/binary/Octets;

.field public final synthetic c:Le/h/d/a/a/w/m;


# direct methods
.method public constructor <init>(Le/h/d/a/a/w/m;Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/d/a/a/w/k;->c:Le/h/d/a/a/w/m;

    iput-object p2, p0, Le/h/d/a/a/w/k;->a:Le/h/d/a/a/o/a/m;

    iput-object p3, p0, Le/h/d/a/a/w/k;->b:Lfr/mbs/binary/Octets;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/w/k;->doInBackground([Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
    .locals 2

    .line 2
    iget-object p1, p0, Le/h/d/a/a/w/k;->c:Le/h/d/a/a/w/m;

    iget-object v0, p0, Le/h/d/a/a/w/k;->a:Le/h/d/a/a/o/a/m;

    iget-object v1, p0, Le/h/d/a/a/w/k;->b:Lfr/mbs/binary/Octets;

    invoke-static {p1, v0, v1}, Le/h/d/a/a/w/m;->a(Le/h/d/a/a/w/m;Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V

    const/4 p1, 0x0

    return-object p1
.end method
