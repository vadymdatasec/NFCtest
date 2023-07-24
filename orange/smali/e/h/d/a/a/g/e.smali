.class public Le/h/d/a/a/g/e;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# instance fields
.field public a:Lcom/orange/oab/contactless/packid/service/PackIdService;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/g/e;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    return-void
.end method


# virtual methods
.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result p1

    const-string v0, "packid.scan"

    const/16 v1, 0x7f

    if-ne p1, v1, :cond_0

    const-string p1, "Advertising without tx power, ignoring advertising"

    .line 2
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v1

    .line 4
    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    if-nez v1, :cond_1

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Missing scan record, ignoring scan result for device "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 6
    :cond_1
    invoke-virtual {v1}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Le/h/d/a/a/g/d;->a([B)Le/h/d/a/a/g/d;

    move-result-object v0

    .line 7
    iget-object v1, p0, Le/h/d/a/a/g/e;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-virtual {v1, p2, v0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Le/h/d/a/a/g/d;I)V

    return-void
.end method
